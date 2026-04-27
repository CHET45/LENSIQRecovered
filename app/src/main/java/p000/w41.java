package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class w41 {

    /* JADX INFO: renamed from: a */
    public final Context f93191a;

    @b28
    public w41(Context context) {
        this.f93191a = context;
    }

    private BluetoothGatt connectGattCompat(BluetoothGattCallback bluetoothGattCallback, BluetoothDevice bluetoothDevice, boolean z) {
        kfe.m14728v("Connecting without reflection", new Object[0]);
        return bluetoothDevice.connectGatt(this.f93191a, z, bluetoothGattCallback, 2);
    }

    private static boolean connectUsingReflection(BluetoothGatt bluetoothGatt, BluetoothGattCallback bluetoothGattCallback, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        kfe.m14728v("Connecting using reflection", new Object[0]);
        setAutoConnectValue(bluetoothGatt, z);
        Method declaredMethod = bluetoothGatt.getClass().getDeclaredMethod("connect", Boolean.class, BluetoothGattCallback.class);
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(bluetoothGatt, Boolean.TRUE, bluetoothGattCallback)).booleanValue();
    }

    @omg(23)
    private BluetoothGatt createBluetoothGatt(Object obj, BluetoothDevice bluetoothDevice) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<?> constructor = BluetoothGatt.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        kfe.m14728v("Found constructor with args count = " + constructor.getParameterTypes().length, new Object[0]);
        return constructor.getParameterTypes().length == 4 ? (BluetoothGatt) constructor.newInstance(this.f93191a, obj, bluetoothDevice, 2) : (BluetoothGatt) constructor.newInstance(this.f93191a, obj, bluetoothDevice);
    }

    private static Object getIBluetoothGatt(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (obj == null) {
            return null;
        }
        return getMethodFromClass(obj.getClass(), "getBluetoothGatt").invoke(obj, null);
    }

    private static Object getIBluetoothManager() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return getMethodFromClass(defaultAdapter.getClass(), "getBluetoothManager").invoke(defaultAdapter, null);
    }

    private static Method getMethodFromClass(Class<?> cls, String str) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, null);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    private static void setAutoConnectValue(BluetoothGatt bluetoothGatt, boolean z) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = bluetoothGatt.getClass().getDeclaredField("mAutoConnect");
        declaredField.setAccessible(true);
        declaredField.setBoolean(bluetoothGatt, z);
    }

    public BluetoothGatt connectGatt(BluetoothDevice bluetoothDevice, boolean z, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        return connectGattCompat(bluetoothGattCallback, bluetoothDevice, z);
    }
}
