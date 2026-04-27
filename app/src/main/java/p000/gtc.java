package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1158q;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.request.RequestOptions;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.PhotoBean;
import com.eyevue.common.bean.PhotoLibraryItem;
import com.eyevue.common.widget.CircleProgressView;
import com.eyevue.common.widget.SimplePercentageView;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.utils.PhotoUtils;
import com.eyevue.glassapp.utils.photo.FileUtils;
import com.eyevue.glassapp.utils.photo.VideoDurationLoader;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public class gtc extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: n */
    public static final int f41054n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f41055o = 1;

    /* JADX INFO: renamed from: b */
    public Context f41057b;

    /* JADX INFO: renamed from: c */
    public ivc f41058c;

    /* JADX INFO: renamed from: d */
    public AbstractC1158q<ArrayList<Uri>> f41059d;

    /* JADX INFO: renamed from: e */
    public AbstractC1158q<Set<Uri>> f41060e;

    /* JADX INFO: renamed from: f */
    public AbstractC1158q<Boolean> f41061f;

    /* JADX INFO: renamed from: k */
    public ltc f41066k;

    /* JADX INFO: renamed from: g */
    public Set<Uri> f41062g = new HashSet();

    /* JADX INFO: renamed from: h */
    public Set<Date> f41063h = new HashSet();

    /* JADX INFO: renamed from: i */
    public boolean f41064i = false;

    /* JADX INFO: renamed from: j */
    public ArrayList<PhotoLibraryItem> f41065j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public HashMap<String, Float> f41067l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public HashMap<String, Integer> f41068m = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final VideoDurationLoader f41056a = new VideoDurationLoader();

    /* JADX INFO: renamed from: gtc$a */
    public class C6533a implements qxb<ArrayList<Uri>> {
        public C6533a() {
        }

        @Override // p000.qxb
        public void onChanged(ArrayList<Uri> uris) {
            gtc.this.f41065j.clear();
            if (uris != null) {
                gtc.this.addData(uris);
            }
            gtc.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: gtc$b */
    public class C6534b implements qxb<Set<Uri>> {
        public C6534b() {
        }

        @Override // p000.qxb
        public void onChanged(Set<Uri> uri) {
            gtc.this.f41062g.clear();
            if (uri != null) {
                gtc.this.f41062g.addAll(uri);
            }
            gtc.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: gtc$c */
    public class C6535c implements qxb<Boolean> {
        public C6535c() {
        }

        @Override // p000.qxb
        public void onChanged(Boolean editMode) {
            gtc.this.f41064i = editMode.booleanValue();
            gtc.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: gtc$d */
    public class ViewOnClickListenerC6536d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f41072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Date f41073b;

        public ViewOnClickListenerC6536d(final boolean val$isSelected, final Date val$date) {
            this.f41072a = val$isSelected;
            this.f41073b = val$date;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (gtc.this.f41064i) {
                if (this.f41072a) {
                    for (PhotoLibraryItem photoLibraryItem : gtc.this.f41065j) {
                        if (photoLibraryItem instanceof PhotoLibraryItem.Photo) {
                            PhotoBean photo = ((PhotoLibraryItem.Photo) photoLibraryItem).getPhoto();
                            if (PhotoUtils.isSameDay(photo.getDate(), this.f41073b)) {
                                gtc.this.f41058c.toggleSelection(photo.getUri(), false);
                            }
                        }
                    }
                    gtc.this.f41063h.remove(this.f41073b);
                } else {
                    for (PhotoLibraryItem photoLibraryItem2 : gtc.this.f41065j) {
                        if (photoLibraryItem2 instanceof PhotoLibraryItem.Photo) {
                            PhotoBean photo2 = ((PhotoLibraryItem.Photo) photoLibraryItem2).getPhoto();
                            if (PhotoUtils.isSameDay(photo2.getDate(), this.f41073b)) {
                                gtc.this.f41058c.toggleSelection(photo2.getUri(), true);
                            }
                        }
                    }
                    gtc.this.f41063h.add(this.f41073b);
                }
                gtc.this.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: gtc$e */
    public class C6537e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f41075a;

        /* JADX INFO: renamed from: b */
        public ImageView f41076b;

        /* JADX INFO: renamed from: c */
        public SimpleDateFormat f41077c;

        public C6537e(@efb View itemView) {
            super(itemView);
            this.f41077c = new SimpleDateFormat("yyyy/M/d", Locale.getDefault());
            this.f41075a = (TextView) itemView.findViewById(C2558R.id.tvDate);
            this.f41076b = (ImageView) itemView.findViewById(C2558R.id.selectionIndicator);
        }

        public void bind(Date date, boolean isSelected) {
            this.f41075a.setText(this.f41077c.format(date));
            this.f41076b.setVisibility(gtc.this.f41064i ? 0 : 8);
            this.f41076b.setSelected(isSelected);
        }
    }

    /* JADX INFO: renamed from: gtc$f */
    public class C6538f extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: C */
        public ImageView f41079C;

        /* JADX INFO: renamed from: F */
        public ConstraintLayout f41080F;

        /* JADX INFO: renamed from: H */
        public SimplePercentageView f41081H;

        /* JADX INFO: renamed from: L */
        public TextView f41082L;

        /* JADX INFO: renamed from: a */
        public ImageView f41084a;

        /* JADX INFO: renamed from: b */
        public ImageView f41085b;

        /* JADX INFO: renamed from: c */
        public ImageView f41086c;

        /* JADX INFO: renamed from: d */
        public RelativeLayout f41087d;

        /* JADX INFO: renamed from: e */
        public TextView f41088e;

        /* JADX INFO: renamed from: f */
        public CircleProgressView f41089f;

        /* JADX INFO: renamed from: m */
        public ImageView f41090m;

        /* JADX INFO: renamed from: gtc$f$a */
        public class a implements VideoDurationLoader.DurationCallback {
            public a() {
            }

            @Override // com.eyevue.glassapp.utils.photo.VideoDurationLoader.DurationCallback
            public void onDurationLoaded(long duration) {
                if (duration <= 0) {
                    C6538f.this.f41088e.setVisibility(8);
                } else {
                    C6538f.this.f41088e.setVisibility(0);
                    C6538f.this.f41088e.setText(FileUtils.formatDuration(duration));
                }
            }
        }

        /* JADX INFO: renamed from: gtc$f$b */
        public class b implements VideoDurationLoader.DurationCallback {
            public b() {
            }

            @Override // com.eyevue.glassapp.utils.photo.VideoDurationLoader.DurationCallback
            public void onDurationLoaded(long duration) {
                if (duration <= 0) {
                    C6538f.this.f41088e.setVisibility(8);
                } else {
                    C6538f.this.f41088e.setVisibility(0);
                    C6538f.this.f41088e.setText(FileUtils.formatDuration(duration));
                }
            }
        }

        public C6538f(@efb View itemView) {
            super(itemView);
            this.f41084a = (ImageView) itemView.findViewById(C2558R.id.imageView);
            this.f41085b = (ImageView) itemView.findViewById(C2558R.id.selectionIndicator);
            this.f41086c = (ImageView) itemView.findViewById(C2558R.id.videoIndicator);
            this.f41087d = (RelativeLayout) itemView.findViewById(C2558R.id.videoLayout);
            this.f41088e = (TextView) itemView.findViewById(C2558R.id.tv_video_duration);
            this.f41089f = (CircleProgressView) itemView.findViewById(C2558R.id.progress);
            this.f41090m = (ImageView) itemView.findViewById(C2558R.id.iv_thumbnail_bg);
            this.f41079C = (ImageView) itemView.findViewById(C2558R.id.iv_thumbnail_state);
            this.f41080F = (ConstraintLayout) itemView.findViewById(C2558R.id.cl_filter);
            this.f41081H = (SimplePercentageView) itemView.findViewById(C2558R.id.v_percent);
            this.f41082L = (TextView) itemView.findViewById(C2558R.id.tv_percent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateDownloadProgress(Uri uri) {
            if (uri.getLastPathSegment().length() <= 10) {
                return;
            }
            if (!uri.getPath().toLowerCase().contains("thumbnail") || gtc.this.f41068m.containsKey(uri.getLastPathSegment().substring(9))) {
                this.f41090m.setVisibility(8);
                this.f41079C.setVisibility(8);
            } else {
                this.f41090m.setVisibility(0);
                this.f41079C.setVisibility(0);
            }
            if (!gtc.this.f41068m.containsKey(uri.getLastPathSegment().substring(9))) {
                this.f41089f.setVisibility(8);
                return;
            }
            int iIntValue = ((Integer) gtc.this.f41068m.get(uri.getLastPathSegment().substring(9))).intValue();
            if (iIntValue >= 100 || iIntValue < 0) {
                this.f41089f.setVisibility(8);
                this.f41090m.setVisibility(8);
            } else {
                this.f41089f.setVisibility(0);
                this.f41090m.setVisibility(0);
            }
            this.f41089f.setCurrent(iIntValue);
        }

        public void bind(Uri uri, boolean isSelected, boolean isEditMode, int position) {
            if (FileUtils.isVideoFile(uri.getPath())) {
                this.f41087d.setVisibility(0);
                gtc.this.f41056a.loadDuration(uri.getPath(), new a());
                ComponentCallbacks2C2485a.with(gtc.this.f41057b).load(uri).apply((cu0<?>) new RequestOptions().frame(1L)).diskCacheStrategy(ne4.f64121e).into(this.f41084a);
            } else if (FileUtils.isAudioFile(uri.getPath())) {
                this.f41087d.setVisibility(0);
                gtc.this.f41056a.loadDuration(uri.getPath(), new b());
                ComponentCallbacks2C2485a.with(gtc.this.f41057b).load(Integer.valueOf(C2531R.drawable.ic_default_audio)).centerCrop().into(this.f41084a);
            } else {
                this.f41087d.setVisibility(8);
                ComponentCallbacks2C2485a.with(gtc.this.f41057b).load(uri).diskCacheStrategy(ne4.f64121e).signature(new bkb(Long.valueOf(new File(uri.getPath()).lastModified()))).override(500, 500).centerCrop().into(this.f41084a);
            }
            this.f41085b.setVisibility(isEditMode ? 0 : 8);
            this.f41085b.setSelected(isSelected);
            updateDownloadProgress(uri);
            updateProgress(uri);
        }

        public void updateProgress(Uri uri) {
            if (!gtc.this.f41067l.containsKey(uri.toString())) {
                this.f41081H.setVisibility(8);
                this.f41080F.setVisibility(8);
                return;
            }
            float fFloatValue = ((Float) gtc.this.f41067l.get(uri.toString())).floatValue();
            if (fFloatValue >= 99.0f) {
                this.f41081H.setBackgroundResource(C2531R.drawable.shape_99000000_corner_12);
            } else {
                this.f41081H.setBackgroundResource(C2531R.drawable.shape_99000000_corner_bottom_12);
            }
            this.f41081H.setHeightPercentage(fFloatValue / 100.0f);
            int iFloor = (int) Math.floor(fFloatValue);
            this.f41082L.setText(iFloor + yv7.f103133a);
            this.f41081H.setVisibility(0);
            this.f41080F.setVisibility(0);
        }
    }

    public gtc(Context context, ivc photoViewModel, ltc listener) {
        this.f41057b = context;
        this.f41058c = photoViewModel;
        this.f41066k = listener;
        this.f41059d = photoViewModel.getMediaUrisLiveData();
        this.f41060e = photoViewModel.getSelectedUrisLiveData();
        this.f41061f = photoViewModel.getEditModeLiveData();
        if (this.f41059d.getValue() != null) {
            addData(this.f41059d.getValue());
        }
        observeDataChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(ArrayList<Uri> uris) {
        ArrayList<PhotoBean> arrayList = new ArrayList();
        if (uris != null) {
            Iterator<Uri> it = uris.iterator();
            while (it.hasNext()) {
                File file = new File(it.next().getPath());
                Date dateFromFileName = PhotoUtils.parseDateFromFileName(file.getName());
                if (dateFromFileName == null) {
                    C2473f.m4168e("lttttt", "解析的日期为空::" + file.getName());
                    dateFromFileName = new Date(file.lastModified());
                }
                arrayList.add(new PhotoBean("ID" + file.getName(), Uri.fromFile(file), file.getName(), dateFromFileName));
            }
        }
        arrayList.sort(new Comparator() { // from class: btc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gtc.lambda$addData$0((PhotoBean) obj, (PhotoBean) obj2);
            }
        });
        HashMap map = new HashMap();
        for (PhotoBean photoBean : arrayList) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(photoBean.getDate());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            ((List) map.computeIfAbsent(calendar.getTime(), new Function() { // from class: ctc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return gtc.lambda$addData$1((Date) obj);
                }
            })).add(photoBean);
        }
        final ArrayList arrayList2 = new ArrayList();
        map.entrySet().stream().sorted(new Comparator() { // from class: dtc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gtc.lambda$addData$2((Map.Entry) obj, (Map.Entry) obj2);
            }
        }).forEach(new Consumer() { // from class: etc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gtc.lambda$addData$3(arrayList2, (Map.Entry) obj);
            }
        });
        this.f41065j.addAll(arrayList2);
    }

    private void checkSelectData(Date date) {
        HashSet hashSet = new HashSet();
        for (PhotoLibraryItem photoLibraryItem : this.f41065j) {
            if (photoLibraryItem instanceof PhotoLibraryItem.Photo) {
                PhotoBean photo = ((PhotoLibraryItem.Photo) photoLibraryItem).getPhoto();
                if (PhotoUtils.isSameDay(photo.getDate(), date)) {
                    hashSet.add(photo.getUri());
                }
            }
        }
        if (this.f41062g.containsAll(hashSet)) {
            this.f41063h.add(date);
        } else {
            this.f41063h.remove(date);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addData$0(PhotoBean photoBean, PhotoBean photoBean2) {
        return photoBean2.getDate().compareTo(photoBean.getDate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$addData$1(Date date) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addData$2(Map.Entry entry, Map.Entry entry2) {
        return ((Date) entry2.getKey()).compareTo((Date) entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addData$3(List list, Map.Entry entry) {
        list.add(new PhotoLibraryItem.Header((Date) entry.getKey()));
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            list.add(new PhotoLibraryItem.Photo((PhotoBean) it.next(), (Date) entry.getKey()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$4(Uri uri, View view) {
        if (this.f41064i) {
            this.f41058c.toggleSelection(uri);
        } else {
            this.f41066k.onPhotoClick(uri);
        }
    }

    private void observeDataChanges() {
        this.f41059d.observeForever(new C6533a());
        this.f41060e.observeForever(new C6534b());
        this.f41061f.observeForever(new C6535c());
    }

    public void clearDownloadMap() {
        HashMap<String, Integer> map = this.f41068m;
        if (map != null) {
            map.clear();
        }
    }

    public int getFilterCount() {
        return this.f41067l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f41065j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.f41065j.get(position) instanceof PhotoLibraryItem.Header ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        if (position < this.f41065j.size()) {
            if (holder instanceof C6537e) {
                C6537e c6537e = (C6537e) holder;
                Date date = ((PhotoLibraryItem.Header) this.f41065j.get(position)).getDate();
                checkSelectData(date);
                boolean zContains = this.f41063h.contains(date);
                c6537e.bind(date, zContains);
                c6537e.itemView.setOnClickListener(new ViewOnClickListenerC6536d(zContains, date));
                return;
            }
            if (holder instanceof C6538f) {
                C6538f c6538f = (C6538f) holder;
                final Uri uri = ((PhotoLibraryItem.Photo) this.f41065j.get(position)).getPhoto().getUri();
                c6538f.bind(uri, this.f41062g.contains(uri), this.f41064i, position);
                c6538f.itemView.setOnClickListener(new View.OnClickListener() { // from class: ftc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37718a.lambda$onBindViewHolder$4(uri, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return viewType == 0 ? new C6537e(LayoutInflater.from(this.f41057b).inflate(C2558R.layout.item_photo_header, parent, false)) : new C6538f(LayoutInflater.from(this.f41057b).inflate(C2558R.layout.item_photo, parent, false));
    }

    public void removePhotoFilterProgressMap(String path) {
        if (this.f41067l.containsKey(path)) {
            this.f41067l.remove(path);
        }
    }

    public void setPhotoFilterProgressMap(HashMap<String, Float> progressMap) {
        Log.e("xtest", "图片进度调试，设置图片进度map");
        this.f41067l.putAll(progressMap);
        notifyDataSetChanged();
    }

    public void updateDownloadProgress(int progress, String fileName) {
        for (int i = 0; i < this.f41065j.size(); i++) {
            if ((this.f41065j.get(i) instanceof PhotoLibraryItem.Photo) && ((PhotoLibraryItem.Photo) this.f41065j.get(i)).getPhoto().getName().contains(fileName)) {
                this.f41068m.put(fileName, Integer.valueOf(progress));
                notifyItemChanged(i, "download");
            }
        }
    }

    public void updatePhotoFilterProgress(String path, Float progress) {
        Log.e("xtest", "图片进度调试，更新图片进度,路径：" + path + ",进度：" + progress);
        if (this.f41067l.containsKey(path)) {
            this.f41067l.put(path, progress);
        }
        for (int i = 0; i < this.f41065j.size(); i++) {
            PhotoLibraryItem photoLibraryItem = this.f41065j.get(i);
            if ((photoLibraryItem instanceof PhotoLibraryItem.Photo) && ((PhotoLibraryItem.Photo) photoLibraryItem).getPhoto().getUri().toString().replace(iei.f46708b, "").equals(path.replace(iei.f46708b, ""))) {
                notifyItemChanged(i, "");
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position, @efb List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        if (holder instanceof C6538f) {
            C6538f c6538f = (C6538f) holder;
            String string = payloads.get(0).toString();
            if (!TextUtils.isEmpty(string) && string.equals("download")) {
                c6538f.updateDownloadProgress(((PhotoLibraryItem.Photo) this.f41065j.get(position)).getPhoto().getUri());
            } else {
                c6538f.updateProgress(((PhotoLibraryItem.Photo) this.f41065j.get(position)).getPhoto().getUri());
            }
        }
    }
}
