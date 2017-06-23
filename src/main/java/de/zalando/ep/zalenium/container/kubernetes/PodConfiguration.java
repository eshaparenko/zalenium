package de.zalando.ep.zalenium.container.kubernetes;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.kubernetes.client.KubernetesClient;

public class PodConfiguration {

    private KubernetesClient client;
    private String containerIdPrefix;
    private String image;
    private List<EnvVar> envVars;
    private Map<String, String> labels;
    private Optional<VolumeMount> sharedFolderVolumeMount;
    private Volume sharedFolderVolume;
    private Map<String, Quantity> podLimits;
    private Map<String, Quantity> podRequests;
    
    public KubernetesClient getClient() {
        return client;
    }
    public void setClient(KubernetesClient client) {
        this.client = client;
    }
    public String getContainerIdPrefix() {
        return containerIdPrefix;
    }
    public void setContainerIdPrefix(String containerIdPrefix) {
        this.containerIdPrefix = containerIdPrefix;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public List<EnvVar> getEnvVars() {
        return envVars;
    }
    public void setEnvVars(List<EnvVar> envVars) {
        this.envVars = envVars;
    }
    public Map<String, String> getLabels() {
        return labels;
    }
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }
    public Optional<VolumeMount> getSharedFolderVolumeMount() {
        return sharedFolderVolumeMount;
    }
    public void setSharedFolderVolumeMount(Optional<VolumeMount> sharedFolderVolumeMount) {
        this.sharedFolderVolumeMount = sharedFolderVolumeMount;
    }
    public Volume getSharedFolderVolume() {
        return sharedFolderVolume;
    }
    public void setSharedFolderVolume(Volume sharedFolderVolume) {
        this.sharedFolderVolume = sharedFolderVolume;
    }
    public Map<String, Quantity> getPodLimits() {
        return podLimits;
    }
    public void setPodLimits(Map<String, Quantity> podLimits) {
        this.podLimits = podLimits;
    }
    public Map<String, Quantity> getPodRequests() {
        return podRequests;
    }
    public void setPodRequests(Map<String, Quantity> podRequests) {
        this.podRequests = podRequests;
    }
}