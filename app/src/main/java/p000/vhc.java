package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface vhc<MessageType> {
    MessageType parseDelimitedFrom(InputStream input) throws be8;

    MessageType parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(e72 input) throws be8;

    MessageType parseFrom(e72 input, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(InputStream input) throws be8;

    MessageType parseFrom(InputStream input, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(ByteBuffer data) throws be8;

    MessageType parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(wj1 data) throws be8;

    MessageType parseFrom(wj1 data, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(byte[] data) throws be8;

    MessageType parseFrom(byte[] data, int off, int len) throws be8;

    MessageType parseFrom(byte[] data, int off, int len, yi5 extensionRegistry) throws be8;

    MessageType parseFrom(byte[] data, yi5 extensionRegistry) throws be8;

    MessageType parsePartialDelimitedFrom(InputStream input) throws be8;

    MessageType parsePartialDelimitedFrom(InputStream input, yi5 extensionRegistry) throws be8;

    MessageType parsePartialFrom(e72 input) throws be8;

    MessageType parsePartialFrom(e72 input, yi5 extensionRegistry) throws be8;

    MessageType parsePartialFrom(InputStream input) throws be8;

    MessageType parsePartialFrom(InputStream input, yi5 extensionRegistry) throws be8;

    MessageType parsePartialFrom(wj1 data) throws be8;

    MessageType parsePartialFrom(wj1 data, yi5 extensionRegistry) throws be8;

    MessageType parsePartialFrom(byte[] data) throws be8;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws be8;

    MessageType parsePartialFrom(byte[] data, int off, int len, yi5 extensionRegistry) throws be8;

    MessageType parsePartialFrom(byte[] data, yi5 extensionRegistry) throws be8;
}
