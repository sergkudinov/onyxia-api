package fr.insee.onyxia.api.controller.pub;

import fr.insee.onyxia.api.services.utils.HttpRequestUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@Tag(name = "Public")
@RequestMapping("/public")
public class IPController {

    @Autowired HttpRequestUtils httpRequestUtils;

    @Operation(
            summary = "Get your public IP address.",
            description =
                    "Get the IP addresses of the service caller if it exist on the forwarding headers, otherwise it returns the remote address of the servlet request.")
    @GetMapping("/ip")
    public IP getIP() {
        IP ip = new IP();
        ip.setIp(
                httpRequestUtils.getClientIpAddressIfServletRequestExist(
                        ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                                .getRequest()));
        return ip;
    }

    public HttpRequestUtils getHttpRequestUtils() {
        return httpRequestUtils;
    }

    public void setHttpRequestUtils(HttpRequestUtils httpRequestUtils) {
        this.httpRequestUtils = httpRequestUtils;
    }

    @Schema(description = "")
    public static class IP {
        @Schema(description = "")
        private String ip;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }
}
