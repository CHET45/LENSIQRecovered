package com.eyevue.common.bean;

import com.arthenica.ffmpegkit.MediaInformation;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.ocd;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoApBean {

    @SerializedName(ocd.f67211j)
    private List<InfoDTO> info;

    @SerializedName("result")
    private Integer result;

    public static class InfoDTO {

        @SerializedName("count")
        private Integer count;

        @SerializedName("files")
        private List<FilesDTO> files;

        @SerializedName("folder")
        private String folder;

        public static class FilesDTO {

            @SerializedName("createtimestr")
            private String createtimestr;

            @SerializedName("name")
            private String name;

            @SerializedName(MediaInformation.KEY_SIZE)
            private Integer size;

            @SerializedName("type")
            private Integer type;

            public String getCreatetimestr() {
                return this.createtimestr;
            }

            public String getName() {
                return this.name;
            }

            public Integer getSize() {
                return this.size;
            }

            public Integer getType() {
                return this.type;
            }

            public void setCreatetimestr(String createtimestr) {
                this.createtimestr = createtimestr;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public void setType(Integer type) {
                this.type = type;
            }
        }

        public Integer getCount() {
            return this.count;
        }

        public List<FilesDTO> getFiles() {
            return this.files;
        }

        public String getFolder() {
            return this.folder;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public void setFiles(List<FilesDTO> files) {
            this.files = files;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }
    }

    public List<InfoDTO> getInfo() {
        return this.info;
    }

    public Integer getResult() {
        return this.result;
    }

    public void setInfo(List<InfoDTO> info) {
        this.info = info;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
