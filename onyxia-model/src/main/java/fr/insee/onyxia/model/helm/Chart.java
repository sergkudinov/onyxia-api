package fr.insee.onyxia.model.helm;

import com.fasterxml.jackson.annotation.*;
import fr.insee.onyxia.model.catalog.Pkg;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "appVersion",
    "created",
    "description",
    "digest",
    "engine",
    "home",
    "icon",
    "keywords",
    "maintainers",
    "name",
    "sources",
    "urls",
    "version"
})
@Schema(description = "Cloudshell data and health")
public class Chart extends Pkg {

    @Schema(description = "")
    @JsonProperty("apiVersion")
    private String apiVersion;

    @Schema(description = "")
    @JsonProperty("appVersion")
    private String appVersion;

    @Schema(description = "")
    @JsonProperty("created")
    private String created;

    @Schema(description = "")
    @JsonProperty("description")
    private String description;

    @Schema(description = "")
    @JsonProperty("type")
    private String type;

    @Schema(description = "")
    @JsonProperty("digest")
    private String digest;

    @Schema(description = "")
    @JsonProperty("engine")
    private String engine;

    @Schema(description = "")
    @JsonProperty("home")
    private String home;

    @Schema(description = "")
    @JsonProperty("icon")
    private String icon;

    @Schema(description = "")
    @JsonProperty("keywords")
    private List<String> keywords = null;

    @Schema(description = "")
    @JsonProperty("maintainers")
    private List<Maintainer> maintainers = null;

    @Schema(description = "")
    @JsonProperty("name")
    private String name;

    @Schema(description = "")
    @JsonProperty("sources")
    private List<String> sources = null;

    @Schema(description = "")
    @JsonProperty("urls")
    private List<String> urls = null;

    @Schema(description = "")
    @JsonProperty("version")
    private String version;

    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("appVersion")
    public String getAppVersion() {
        return appVersion;
    }

    @JsonProperty("appVersion")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    @JsonProperty("digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @JsonProperty("engine")
    public String getEngine() {
        return engine;
    }

    @JsonProperty("engine")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @JsonProperty("home")
    public String getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(String home) {
        this.home = home;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("maintainers")
    public List<Maintainer> getMaintainers() {
        return maintainers;
    }

    @JsonProperty("maintainers")
    public void setMaintainers(List<Maintainer> maintainers) {
        this.maintainers = maintainers;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    @JsonProperty("urls")
    public List<String> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    private class Maintainer {
        @JsonProperty("email")
        private String email;

        @JsonProperty("name")
        private String name;

        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }
}
