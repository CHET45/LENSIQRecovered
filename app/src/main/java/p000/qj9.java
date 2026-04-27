package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.Iterator;
import p000.a77;

/* JADX INFO: loaded from: classes6.dex */
public class qj9 {

    /* JADX INFO: renamed from: a */
    public final ow1 f74598a;

    @b28
    public qj9(ow1 ow1Var) {
        this.f74598a = ow1Var;
    }

    private static void appendCharacteristicNameHeader(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append("* ");
        sb.append(createCharacteristicName(bluetoothGattCharacteristic));
        sb.append(" (");
        sb.append(pj9.getUuidToLog(bluetoothGattCharacteristic.getUuid()));
        sb.append(c0b.f15434d);
    }

    private void appendCharacteristicProperties(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append(a77.C0077a.f542d);
        sb.append("Properties: ");
        sb.append(this.f74598a.propertiesIntToString(bluetoothGattCharacteristic.getProperties()));
    }

    private static void appendDescriptorNameHeader(StringBuilder sb, BluetoothGattDescriptor bluetoothGattDescriptor) {
        sb.append('\n');
        sb.append('\t');
        sb.append('\t');
        sb.append("* ");
        sb.append(createDescriptorName(bluetoothGattDescriptor));
        sb.append(" (");
        sb.append(pj9.getUuidToLog(bluetoothGattDescriptor.getUuid()));
        sb.append(c0b.f15434d);
    }

    private static void appendDescriptors(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            return;
        }
        appendDescriptorsHeader(sb);
        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            appendDescriptorNameHeader(sb, it.next());
        }
    }

    private static void appendDescriptorsHeader(StringBuilder sb) {
        sb.append('\n');
        sb.append('\t');
        sb.append(a77.C0077a.f542d);
        sb.append("-> Descriptors: ");
    }

    private static void appendDeviceHeader(BluetoothDevice bluetoothDevice, StringBuilder sb) {
        sb.append("--------------- ====== Printing peripheral content ====== ---------------\n");
        sb.append(pj9.commonMacMessage(bluetoothDevice.getAddress()));
        sb.append('\n');
        sb.append("PERIPHERAL NAME: ");
        sb.append(bluetoothDevice.getName());
        sb.append('\n');
        sb.append("-------------------------------------------------------------------------");
    }

    private void appendServiceDescription(StringBuilder sb, BluetoothGattService bluetoothGattService) {
        appendServiceHeader(sb, bluetoothGattService);
        sb.append("-> Characteristics:");
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            appendCharacteristicNameHeader(sb, bluetoothGattCharacteristic);
            appendCharacteristicProperties(sb, bluetoothGattCharacteristic);
            appendDescriptors(sb, bluetoothGattCharacteristic);
        }
    }

    private static void appendServiceHeader(StringBuilder sb, BluetoothGattService bluetoothGattService) {
        sb.append("\n");
        sb.append(createServiceType(bluetoothGattService));
        sb.append(" - ");
        sb.append(createServiceName(bluetoothGattService));
        sb.append(" (");
        sb.append(pj9.getUuidToLog(bluetoothGattService.getUuid()));
        sb.append(")\n");
        sb.append("Instance ID: ");
        sb.append(bluetoothGattService.getInstanceId());
        sb.append('\n');
    }

    private static String createCharacteristicName(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String characteristicName = j1g.getCharacteristicName(bluetoothGattCharacteristic.getUuid());
        return characteristicName == null ? "Unknown characteristic" : characteristicName;
    }

    private static String createDescriptorName(BluetoothGattDescriptor bluetoothGattDescriptor) {
        String descriptorName = j1g.getDescriptorName(bluetoothGattDescriptor.getUuid());
        return descriptorName == null ? "Unknown descriptor" : descriptorName;
    }

    private static String createServiceName(BluetoothGattService bluetoothGattService) {
        String serviceName = j1g.getServiceName(bluetoothGattService.getUuid());
        return serviceName == null ? "Unknown service" : serviceName;
    }

    private static String createServiceType(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getType() == 0 ? "Primary Service" : "Secondary Service";
    }

    private String prepareServicesDescription(ffe ffeVar, BluetoothDevice bluetoothDevice) {
        StringBuilder sb = new StringBuilder();
        appendDeviceHeader(bluetoothDevice, sb);
        for (BluetoothGattService bluetoothGattService : ffeVar.getBluetoothGattServices()) {
            sb.append('\n');
            appendServiceDescription(sb, bluetoothGattService);
        }
        sb.append("\n--------------- ====== Finished peripheral content ====== ---------------");
        return sb.toString();
    }

    public void log(ffe ffeVar, BluetoothDevice bluetoothDevice) {
        if (kfe.isAtLeast(2)) {
            kfe.m14728v("Preparing services description", new Object[0]);
            kfe.m14728v(prepareServicesDescription(ffeVar, bluetoothDevice), new Object[0]);
        }
    }
}
