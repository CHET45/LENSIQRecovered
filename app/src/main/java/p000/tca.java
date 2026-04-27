package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1158q;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.utils.glide.GlideUtil;
import com.eyevue.glassapp.utils.photo.FileUtils;
import com.eyevue.glassapp.view.photo.FullScreenImageActivity;
import com.eyevue.glassapp.view.photo.FullScreenVideoActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class tca extends RecyclerView.Adapter<C12987d> {

    /* JADX INFO: renamed from: a */
    public Context f84254a;

    /* JADX INFO: renamed from: b */
    public ivc f84255b;

    /* JADX INFO: renamed from: c */
    public AbstractC1158q<ArrayList<Uri>> f84256c;

    /* JADX INFO: renamed from: d */
    public AbstractC1158q<Set<Uri>> f84257d;

    /* JADX INFO: renamed from: e */
    public AbstractC1158q<Boolean> f84258e;

    /* JADX INFO: renamed from: f */
    public Set<Uri> f84259f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f84260g = false;

    /* JADX INFO: renamed from: h */
    public ArrayList<Uri> f84261h = new ArrayList<>();

    /* JADX INFO: renamed from: tca$a */
    public class C12984a implements qxb<ArrayList<Uri>> {
        public C12984a() {
        }

        @Override // p000.qxb
        public void onChanged(ArrayList<Uri> uris) {
            tca.this.f84261h.clear();
            if (uris != null) {
                tca.this.f84261h.addAll(uris);
            }
            tca.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: tca$b */
    public class C12985b implements qxb<Set<Uri>> {
        public C12985b() {
        }

        @Override // p000.qxb
        public void onChanged(Set<Uri> positions) {
            tca.this.f84259f.clear();
            if (positions != null) {
                tca.this.f84259f.addAll(positions);
            }
            tca.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: tca$c */
    public class C12986c implements qxb<Boolean> {
        public C12986c() {
        }

        @Override // p000.qxb
        public void onChanged(Boolean editMode) {
            tca.this.f84260g = editMode.booleanValue();
            tca.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: tca$d */
    public class C12987d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public ImageView f84265a;

        /* JADX INFO: renamed from: b */
        public ImageView f84266b;

        /* JADX INFO: renamed from: c */
        public ImageView f84267c;

        public C12987d(@efb View itemView) {
            super(itemView);
            this.f84265a = (ImageView) itemView.findViewById(C2558R.id.imageView);
            this.f84266b = (ImageView) itemView.findViewById(C2558R.id.selectionIndicator);
            this.f84267c = (ImageView) itemView.findViewById(C2558R.id.videoIndicator);
        }

        public void bind(Uri uri, boolean isSelected, boolean isEditMode, boolean isVideo) {
            GlideUtil.loadRoundedImage(tca.this.f84254a, uri, this.f84265a, 16);
            this.f84267c.setVisibility(isVideo ? 0 : 8);
            this.f84266b.setVisibility(isEditMode ? 0 : 8);
            this.f84266b.setSelected(isSelected);
        }
    }

    public tca(Context context, ivc photoViewModel) {
        this.f84254a = context;
        this.f84255b = photoViewModel;
        this.f84256c = photoViewModel.getMediaUrisLiveData();
        this.f84257d = photoViewModel.getSelectedUrisLiveData();
        this.f84258e = photoViewModel.getEditModeLiveData();
        if (this.f84256c.getValue() != null) {
            this.f84261h.addAll(this.f84256c.getValue());
        }
        observeDataChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(Uri uri, boolean z, View view) {
        if (this.f84260g) {
            this.f84255b.toggleSelection(uri);
            return;
        }
        if (z) {
            Intent intent = new Intent(this.f84254a, (Class<?>) FullScreenVideoActivity.class);
            intent.putExtra("mediaUri", uri);
            this.f84254a.startActivity(intent);
        } else {
            Intent intent2 = new Intent(this.f84254a, (Class<?>) FullScreenImageActivity.class);
            intent2.putExtra("imageUri", uri);
            this.f84254a.startActivity(intent2);
        }
    }

    private void observeDataChanges() {
        this.f84256c.observeForever(new C12984a());
        this.f84257d.observeForever(new C12985b());
        this.f84258e.observeForever(new C12986c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84261h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C12987d holder, int position) {
        if (position < this.f84261h.size()) {
            final Uri uri = this.f84261h.get(position);
            boolean zContains = this.f84259f.contains(Integer.valueOf(position));
            final boolean zIsVideoFile = FileUtils.isVideoFile(uri.getLastPathSegment());
            holder.bind(uri, zContains, this.f84260g, zIsVideoFile);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: sca
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81216a.lambda$onBindViewHolder$0(uri, zIsVideoFile, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C12987d onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C12987d(LayoutInflater.from(this.f84254a).inflate(C2558R.layout.item_photo, parent, false));
    }
}
