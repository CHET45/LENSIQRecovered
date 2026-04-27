package com.eyevue.common.bean;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoLibraryItem {

    public static class Header extends PhotoLibraryItem {
        Date date;

        public Header(Date date) {
            this.date = date;
        }

        public Date getDate() {
            return this.date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    public static class Photo extends PhotoLibraryItem {
        Date date;
        PhotoBean photo;

        public Photo(PhotoBean photo, Date date) {
            this.photo = photo;
            this.date = date;
        }

        public Date getDate() {
            return this.date;
        }

        public PhotoBean getPhoto() {
            return this.photo;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }
    }
}
