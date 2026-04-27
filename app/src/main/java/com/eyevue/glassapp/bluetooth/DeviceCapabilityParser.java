package com.eyevue.glassapp.bluetooth;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceCapabilityParser {
    public static String getCapabilityReport(byte[] data) {
        StringBuilder sb = new StringBuilder();
        EnumSet<DeviceCapability> capabilities = parseCapabilities(data);
        sb.append("设备支持的功能:\n");
        if (capabilities.isEmpty()) {
            sb.append("  无\n");
        } else {
            for (DeviceCapability deviceCapability : capabilities) {
                sb.append("  ✓ ");
                sb.append(deviceCapability.getDescription());
                sb.append(" (位");
                sb.append(deviceCapability.getBitPosition());
                sb.append(")\n");
            }
        }
        sb.append(String.format("位掩码值: 0x%08X", Integer.valueOf(((data[3] & 255) << 24) | (data[0] & 255) | ((data[1] & 255) << 8) | ((data[2] & 255) << 16))));
        return sb.toString();
    }

    public static EnumSet<DeviceCapability> parseCapabilities(byte[] data) {
        if (data == null || data.length != 4) {
            throw new IllegalArgumentException("功能数据必须为4字节");
        }
        int i = (data[3] & 255) | ((data[0] & 255) << 24) | ((data[1] & 255) << 16) | ((data[2] & 255) << 8);
        EnumSet<DeviceCapability> enumSetNoneOf = EnumSet.noneOf(DeviceCapability.class);
        for (int i2 = 0; i2 < 32; i2++) {
            if (((i >> i2) & 1) == 1) {
                DeviceCapability byBitPosition = DeviceCapability.getByBitPosition(i2);
                if (byBitPosition != null) {
                    enumSetNoneOf.add(byBitPosition);
                } else {
                    System.out.println("发现未定义的功能位: " + i2);
                }
            }
        }
        return enumSetNoneOf;
    }

    public static boolean supportsCapability(byte[] data, DeviceCapability capability) {
        return parseCapabilities(data).contains(capability);
    }
}
