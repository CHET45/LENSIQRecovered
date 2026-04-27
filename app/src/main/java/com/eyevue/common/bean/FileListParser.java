package com.eyevue.common.bean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class FileListParser {

    public static class FileItem {
        private int attr;
        private String fpath;
        private String name;
        private long size;
        private String time;
        private long timecode;

        public FileItem() {
        }

        public int getAttr() {
            return this.attr;
        }

        public String getFpath() {
            return this.fpath;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public String getTime() {
            return this.time;
        }

        public long getTimecode() {
            return this.timecode;
        }

        public void setAttr(int attr) {
            this.attr = attr;
        }

        public void setFpath(String fpath) {
            this.fpath = fpath;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setTimecode(long timecode) {
            this.timecode = timecode;
        }

        public String toString() {
            return "FileItem{name='" + this.name + "', fpath='" + this.fpath + "', size=" + this.size + ", timecode=" + this.timecode + ", time='" + this.time + "', attr=" + this.attr + '}';
        }

        public FileItem(String name, String fpath, long size, long timecode, String time) {
            this.name = name;
            this.fpath = fpath;
            this.size = size;
            this.timecode = timecode;
            this.time = time;
        }
    }

    public static List<FileItem> parseXml(String xmlString) throws XmlPullParserException, IOException {
        return parseXml(new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8)));
    }

    private static String readText(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.next() != 4) {
            return "";
        }
        String text = parser.getText();
        parser.nextTag();
        return text;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.eyevue.common.bean.FileListParser.FileItem> parseXml(java.io.InputStream r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.common.bean.FileListParser.parseXml(java.io.InputStream):java.util.List");
    }
}
