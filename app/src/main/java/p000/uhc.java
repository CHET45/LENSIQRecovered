package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface uhc<MessageType> {
    MessageType parseDelimitedFrom(InputStream input) throws ce8;

    MessageType parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(f72 input) throws ce8;

    MessageType parseFrom(f72 input, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(InputStream input) throws ce8;

    MessageType parseFrom(InputStream input, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(ByteBuffer data) throws ce8;

    MessageType parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(vj1 data) throws ce8;

    MessageType parseFrom(vj1 data, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(byte[] data) throws ce8;

    MessageType parseFrom(byte[] data, int off, int len) throws ce8;

    MessageType parseFrom(byte[] data, int off, int len, zi5 extensionRegistry) throws ce8;

    MessageType parseFrom(byte[] data, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialDelimitedFrom(InputStream input) throws ce8;

    MessageType parsePartialDelimitedFrom(InputStream input, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialFrom(f72 input) throws ce8;

    MessageType parsePartialFrom(f72 input, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialFrom(InputStream input) throws ce8;

    MessageType parsePartialFrom(InputStream input, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialFrom(vj1 data) throws ce8;

    MessageType parsePartialFrom(vj1 data, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialFrom(byte[] data) throws ce8;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws ce8;

    MessageType parsePartialFrom(byte[] data, int off, int len, zi5 extensionRegistry) throws ce8;

    MessageType parsePartialFrom(byte[] data, zi5 extensionRegistry) throws ce8;
}
