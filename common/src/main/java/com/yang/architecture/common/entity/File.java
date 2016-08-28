package com.yang.architecture.common.entity;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public class File {
    private Long uuid;
    private String fileName;
    private String remotePaths;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRemotePaths() {
        return remotePaths;
    }

    public void setRemotePaths(String remotePaths) {
        this.remotePaths = remotePaths;
    }

    @Override
    public String toString() {
        return "File{" +
                "uuid=" + uuid +
                ", fileName='" + fileName + '\'' +
                ", remotePaths='" + remotePaths + '\'' +
                '}';
    }
}
