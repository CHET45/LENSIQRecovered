package com.eyevue.common.bean.ota;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.g55;

/* JADX INFO: loaded from: classes4.dex */
public class OtaBean {

    @SerializedName("ble")
    private BleDTO ble;

    @SerializedName("wifi")
    private WifiDTO wifi;

    public static class BleDTO {

        @SerializedName("InternationalData")
        private List<InternationalDataDTO> internationalData;

        @SerializedName("OtaPackage")
        private OtaPackageDTO otaPackage;

        public static class InternationalDataDTO {

            @SerializedName("businessId")
            private String businessId;

            @SerializedName("createBy")
            private String createBy;

            @SerializedName("createTime")
            private long createTime;

            @SerializedName("detail")
            private String detail;

            /* JADX INFO: renamed from: id */
            @SerializedName("id")
            private String f17904id;

            @SerializedName("languageCode")
            private String languageCode;

            @SerializedName("languageName")
            private String languageName;

            @SerializedName("tableName")
            private String tableName;

            @SerializedName("updateBy")
            private String updateBy;

            @SerializedName("updateTime")
            private long updateTime;

            public String getBusinessId() {
                return this.businessId;
            }

            public String getCreateBy() {
                return this.createBy;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public String getDetail() {
                return this.detail;
            }

            public String getId() {
                return this.f17904id;
            }

            public String getLanguageCode() {
                return this.languageCode;
            }

            public String getLanguageName() {
                return this.languageName;
            }

            public String getTableName() {
                return this.tableName;
            }

            public String getUpdateBy() {
                return this.updateBy;
            }

            public long getUpdateTime() {
                return this.updateTime;
            }

            public void setBusinessId(String businessId) {
                this.businessId = businessId;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public void setId(String id) {
                this.f17904id = id;
            }

            public void setLanguageCode(String languageCode) {
                this.languageCode = languageCode;
            }

            public void setLanguageName(String languageName) {
                this.languageName = languageName;
            }

            public void setTableName(String tableName) {
                this.tableName = tableName;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }
        }

        public static class OtaPackageDTO {

            @SerializedName("auditStatus")
            private int auditStatus;

            @SerializedName("clientType")
            private int clientType;

            @SerializedName(g55.f38796e)
            private String code;

            @SerializedName("createBy")
            private String createBy;

            @SerializedName("createTime")
            private String createTime;

            @SerializedName("customerId")
            private String customerId;

            @SerializedName("customerName")
            private String customerName;

            @SerializedName("deleted")
            private boolean deleted;

            @SerializedName("deviceVersion")
            private String deviceVersion;

            /* JADX INFO: renamed from: id */
            @SerializedName("id")
            private String f17905id;

            @SerializedName("otaArray")
            private String otaArray;

            @SerializedName("packageName")
            private String packageName;

            @SerializedName("updateBy")
            private String updateBy;

            @SerializedName("updateTime")
            private Object updateTime;

            public int getAuditStatus() {
                return this.auditStatus;
            }

            public int getClientType() {
                return this.clientType;
            }

            public String getCode() {
                return this.code;
            }

            public String getCreateBy() {
                return this.createBy;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getCustomerId() {
                return this.customerId;
            }

            public String getCustomerName() {
                return this.customerName;
            }

            public String getDeviceVersion() {
                return this.deviceVersion;
            }

            public String getId() {
                return this.f17905id;
            }

            public String getOtaArray() {
                return this.otaArray;
            }

            public String getPackageName() {
                return this.packageName;
            }

            public String getUpdateBy() {
                return this.updateBy;
            }

            public Object getUpdateTime() {
                return this.updateTime;
            }

            public boolean isDeleted() {
                return this.deleted;
            }

            public void setAuditStatus(int auditStatus) {
                this.auditStatus = auditStatus;
            }

            public void setClientType(int clientType) {
                this.clientType = clientType;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public void setCustomerId(String customerId) {
                this.customerId = customerId;
            }

            public void setCustomerName(String customerName) {
                this.customerName = customerName;
            }

            public void setDeleted(boolean deleted) {
                this.deleted = deleted;
            }

            public void setDeviceVersion(String deviceVersion) {
                this.deviceVersion = deviceVersion;
            }

            public void setId(String id) {
                this.f17905id = id;
            }

            public void setOtaArray(String otaArray) {
                this.otaArray = otaArray;
            }

            public void setPackageName(String packageName) {
                this.packageName = packageName;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }
        }

        public List<InternationalDataDTO> getInternationalData() {
            return this.internationalData;
        }

        public OtaPackageDTO getOtaPackage() {
            return this.otaPackage;
        }

        public void setInternationalData(List<InternationalDataDTO> internationalData) {
            this.internationalData = internationalData;
        }

        public void setOtaPackage(OtaPackageDTO otaPackage) {
            this.otaPackage = otaPackage;
        }
    }

    public static class WifiDTO {

        @SerializedName("InternationalData")
        private List<InternationalDataDTO> internationalData;

        @SerializedName("OtaPackage")
        private OtaPackageDTO otaPackage;

        public static class InternationalDataDTO {

            @SerializedName("businessId")
            private String businessId;

            @SerializedName("createBy")
            private String createBy;

            @SerializedName("createTime")
            private long createTime;

            @SerializedName("detail")
            private String detail;

            /* JADX INFO: renamed from: id */
            @SerializedName("id")
            private String f17906id;

            @SerializedName("languageCode")
            private String languageCode;

            @SerializedName("languageName")
            private String languageName;

            @SerializedName("tableName")
            private String tableName;

            @SerializedName("updateBy")
            private String updateBy;

            @SerializedName("updateTime")
            private long updateTime;

            public String getBusinessId() {
                return this.businessId;
            }

            public String getCreateBy() {
                return this.createBy;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public String getDetail() {
                return this.detail;
            }

            public String getId() {
                return this.f17906id;
            }

            public String getLanguageCode() {
                return this.languageCode;
            }

            public String getLanguageName() {
                return this.languageName;
            }

            public String getTableName() {
                return this.tableName;
            }

            public String getUpdateBy() {
                return this.updateBy;
            }

            public long getUpdateTime() {
                return this.updateTime;
            }

            public void setBusinessId(String businessId) {
                this.businessId = businessId;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public void setId(String id) {
                this.f17906id = id;
            }

            public void setLanguageCode(String languageCode) {
                this.languageCode = languageCode;
            }

            public void setLanguageName(String languageName) {
                this.languageName = languageName;
            }

            public void setTableName(String tableName) {
                this.tableName = tableName;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }
        }

        public static class OtaPackageDTO {

            @SerializedName("auditStatus")
            private int auditStatus;

            @SerializedName("clientType")
            private int clientType;

            @SerializedName(g55.f38796e)
            private String code;

            @SerializedName("createBy")
            private String createBy;

            @SerializedName("createTime")
            private String createTime;

            @SerializedName("customerId")
            private String customerId;

            @SerializedName("customerName")
            private String customerName;

            @SerializedName("deleted")
            private boolean deleted;

            @SerializedName("deviceVersion")
            private String deviceVersion;

            /* JADX INFO: renamed from: id */
            @SerializedName("id")
            private String f17907id;

            @SerializedName("otaArray")
            private String otaArray;

            @SerializedName("packageName")
            private String packageName;

            @SerializedName("updateBy")
            private String updateBy;

            @SerializedName("updateTime")
            private Object updateTime;

            public int getAuditStatus() {
                return this.auditStatus;
            }

            public int getClientType() {
                return this.clientType;
            }

            public String getCode() {
                return this.code;
            }

            public String getCreateBy() {
                return this.createBy;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getCustomerId() {
                return this.customerId;
            }

            public String getCustomerName() {
                return this.customerName;
            }

            public String getDeviceVersion() {
                return this.deviceVersion;
            }

            public String getId() {
                return this.f17907id;
            }

            public String getOtaArray() {
                return this.otaArray;
            }

            public String getPackageName() {
                return this.packageName;
            }

            public String getUpdateBy() {
                return this.updateBy;
            }

            public Object getUpdateTime() {
                return this.updateTime;
            }

            public boolean isDeleted() {
                return this.deleted;
            }

            public void setAuditStatus(int auditStatus) {
                this.auditStatus = auditStatus;
            }

            public void setClientType(int clientType) {
                this.clientType = clientType;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public void setCustomerId(String customerId) {
                this.customerId = customerId;
            }

            public void setCustomerName(String customerName) {
                this.customerName = customerName;
            }

            public void setDeleted(boolean deleted) {
                this.deleted = deleted;
            }

            public void setDeviceVersion(String deviceVersion) {
                this.deviceVersion = deviceVersion;
            }

            public void setId(String id) {
                this.f17907id = id;
            }

            public void setOtaArray(String otaArray) {
                this.otaArray = otaArray;
            }

            public void setPackageName(String packageName) {
                this.packageName = packageName;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }
        }

        public List<InternationalDataDTO> getInternationalData() {
            return this.internationalData;
        }

        public OtaPackageDTO getOtaPackage() {
            return this.otaPackage;
        }

        public void setInternationalData(List<InternationalDataDTO> internationalData) {
            this.internationalData = internationalData;
        }

        public void setOtaPackage(OtaPackageDTO otaPackage) {
            this.otaPackage = otaPackage;
        }
    }

    public BleDTO getBle() {
        return this.ble;
    }

    public WifiDTO getWifi() {
        return this.wifi;
    }

    public void setBle(BleDTO ble) {
        this.ble = ble;
    }

    public void setWifi(WifiDTO wifi) {
        this.wifi = wifi;
    }
}
