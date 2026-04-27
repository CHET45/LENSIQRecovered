package p000;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.glassapp.database.aichat.AiChatMessage;
import com.eyevue.glassapp.database.aichat.AiChatMessageSelect;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.watchfun.aichat.C3993R;
import com.watchfun.transcommon.manager.p013ai.MarkDownHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.vfe;

/* JADX INFO: renamed from: vj */
/* JADX INFO: loaded from: classes4.dex */
public class C14100vj extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: q */
    public static final String f91283q = "GptChatAiAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f91284a;

    /* JADX INFO: renamed from: b */
    public m f91285b;

    /* JADX INFO: renamed from: d */
    public uf8 f91287d;

    /* JADX INFO: renamed from: e */
    public mx1 f91288e;

    /* JADX INFO: renamed from: f */
    public vf8 f91289f;

    /* JADX INFO: renamed from: g */
    public int f91290g;

    /* JADX INFO: renamed from: h */
    public lx1 f91291h;

    /* JADX INFO: renamed from: i */
    public boolean f91292i;

    /* JADX INFO: renamed from: j */
    public boolean f91293j;

    /* JADX INFO: renamed from: k */
    public AnimationDrawable f91294k;

    /* JADX INFO: renamed from: l */
    public boolean f91295l;

    /* JADX INFO: renamed from: o */
    public boolean f91298o;

    /* JADX INFO: renamed from: p */
    public boolean f91299p;

    /* JADX INFO: renamed from: m */
    public String f91296m = "";

    /* JADX INFO: renamed from: n */
    public int f91297n = 5;

    /* JADX INFO: renamed from: c */
    public ArrayList<AiChatMessageSelect> f91286c = new ArrayList<>();

    /* JADX INFO: renamed from: vj$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AiChatMessageSelect f91300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f91301b;

        public a(final AiChatMessageSelect val$bean, final int val$position) {
            this.f91300a = val$bean;
            this.f91301b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91299p = false;
            this.f91300a.setSelect(!r2.isSelect());
            C14100vj.this.notifyItemChanged(this.f91301b);
            C14100vj.this.f91285b.click(C14100vj.this.f91299p);
        }
    }

    /* JADX INFO: renamed from: vj$b */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (!AiWebSocketManager.getInstance().isDialogueEnd()) {
                return false;
            }
            C14100vj.this.setEditMode(!r4.f91298o);
            C14100vj.this.f91285b.onItemLongClick(C14100vj.this.f91298o, C14100vj.this.f91299p);
            return false;
        }
    }

    /* JADX INFO: renamed from: vj$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f91304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AiChatMessage f91305b;

        public c(final int val$position, final AiChatMessage val$userAiInfo) {
            this.f91304a = val$position;
            this.f91305b = val$userAiInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91285b.onItemChatPlayVoice(v.findViewById(C3993R.id.receive_img_voice_btn), this.f91304a, this.f91305b);
        }
    }

    /* JADX INFO: renamed from: vj$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f91307a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AiChatMessage f91308b;

        public d(final int val$position, final AiChatMessage val$userAiInfo) {
            this.f91307a = val$position;
            this.f91308b = val$userAiInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91285b.onItemTranslate(this.f91307a, this.f91308b);
        }
    }

    /* JADX INFO: renamed from: vj$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AiChatMessageSelect f91310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f91311b;

        public e(final AiChatMessageSelect val$bean, final int val$position) {
            this.f91310a = val$bean;
            this.f91311b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91299p = false;
            this.f91310a.setSelect(!r2.isSelect());
            C14100vj.this.notifyItemChanged(this.f91311b);
            C14100vj.this.f91285b.click(C14100vj.this.f91299p);
        }
    }

    /* JADX INFO: renamed from: vj$f */
    public class f implements View.OnLongClickListener {
        public f() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (!AiWebSocketManager.getInstance().isDialogueEnd()) {
                return false;
            }
            C14100vj.this.setEditMode(!r4.f91298o);
            C14100vj.this.f91285b.onItemLongClick(C14100vj.this.f91298o, C14100vj.this.f91299p);
            return false;
        }
    }

    /* JADX INFO: renamed from: vj$g */
    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AiChatMessageSelect f91314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f91315b;

        public g(final AiChatMessageSelect val$bean, final int val$position) {
            this.f91314a = val$bean;
            this.f91315b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91299p = false;
            this.f91314a.setSelect(!r2.isSelect());
            C14100vj.this.notifyItemChanged(this.f91315b);
            C14100vj.this.f91285b.click(C14100vj.this.f91299p);
        }
    }

    /* JADX INFO: renamed from: vj$h */
    public class h implements View.OnLongClickListener {
        public h() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (!AiWebSocketManager.getInstance().isDialogueEnd()) {
                return false;
            }
            C14100vj.this.setEditMode(!r4.f91298o);
            C14100vj.this.f91285b.onItemLongClick(C14100vj.this.f91298o, C14100vj.this.f91299p);
            return false;
        }
    }

    /* JADX INFO: renamed from: vj$i */
    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AiChatMessage f91318a;

        public i(final AiChatMessage val$userAiInfo) {
            this.f91318a = val$userAiInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C14100vj.this.f91285b.onImageClick(this.f91318a.getImagePath());
        }
    }

    /* JADX INFO: renamed from: vj$j */
    public static class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public mx1 f91320a;

        /* JADX INFO: renamed from: b */
        public m f91321b;

        public j(View itemView, m myItemClickListener) {
            super(itemView);
            this.f91321b = myItemClickListener;
        }

        public mx1 getBinding() {
            return this.f91320a;
        }

        public void setBinding(mx1 binding) {
            this.f91320a = binding;
        }
    }

    /* JADX INFO: renamed from: vj$k */
    public static class k extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public uf8 f91322a;

        /* JADX INFO: renamed from: b */
        public m f91323b;

        public k(View itemView, m myItemClickListener) {
            super(itemView);
            this.f91323b = myItemClickListener;
        }

        public uf8 getBinding() {
            return this.f91322a;
        }

        public void setBinding(uf8 binding) {
            this.f91322a = binding;
        }
    }

    /* JADX INFO: renamed from: vj$l */
    public static class l extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public final m f91324a;

        /* JADX INFO: renamed from: b */
        public vf8 f91325b;

        public l(View itemView, m myItemClickListener) {
            super(itemView);
            this.f91324a = myItemClickListener;
        }

        public vf8 getBinding() {
            return this.f91325b;
        }

        public void setBinding(vf8 binding) {
            this.f91325b = binding;
        }
    }

    /* JADX INFO: renamed from: vj$m */
    public interface m {
        void click(boolean isAllSelect);

        void onImageClick(String url);

        void onItemChatPlayVoice(View view, int position, AiChatMessage userAiInfo);

        void onItemChatVoice(View view, int position, String path);

        void onItemLongClick(boolean isEditMode, boolean isAllSelect);

        void onItemTranslate(int position, AiChatMessage userAiInfo);
    }

    public C14100vj(Context context) {
        this.f91284a = context;
    }

    private int resolveThemeColor(Context context, @gc0 int attrRes) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrRes, typedValue, true);
        return lx2.getColor(context, typedValue.resourceId);
    }

    public void addData(AiChatMessage aiChatMessage) {
        this.f91293j = false;
        this.f91286c.add(new AiChatMessageSelect(false, aiChatMessage));
        notifyDataSetChanged();
    }

    public void clearData() {
        this.f91286c.clear();
        notifyDataSetChanged();
    }

    public String getCurrentPlayingMsgId() {
        return this.f91296m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<AiChatMessageSelect> arrayList = this.f91286c;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f91286c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f91286c)) {
            this.f91290g = this.f91286c.get(position).getAiChatMessage().getMsgType();
        }
        return this.f91290g;
    }

    public List<AiChatMessage> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<AiChatMessageSelect> arrayList2 = this.f91286c;
        if (arrayList2 != null) {
            for (AiChatMessageSelect aiChatMessageSelect : arrayList2) {
                if (aiChatMessageSelect.isSelect()) {
                    arrayList.add(aiChatMessageSelect.getAiChatMessage());
                }
            }
        }
        return arrayList;
    }

    public boolean isWorking() {
        return this.f91295l;
    }

    public void notifyItemChangedAnim(int position, boolean mIsPointAnimation) {
        this.f91293j = mIsPointAnimation;
        notifyItemChanged(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        try {
            AiChatMessageSelect aiChatMessageSelect = this.f91286c.get(position);
            AiChatMessage aiChatMessage = aiChatMessageSelect.getAiChatMessage();
            hy2 hy2Var = new hy2(this.f91284a, vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a));
            if (holder instanceof k) {
                this.f91287d = ((k) holder).f91322a;
                this.f91287d.f87884f.setBackground(u20.getDrawable(hy2Var, C3993R.drawable.btn_ai_light_blue).mutate());
                this.f91287d.f87884f.postInvalidate();
                this.f91287d.f87877F.setVisibility(8);
                this.f91287d.f87878H.setText(aiChatMessage.getContent().trim());
                if (position > 1) {
                    long messageTime = this.f91286c.get(position - 1).getAiChatMessage().getMessageTime();
                    long messageTime2 = aiChatMessage.getMessageTime();
                    if (messageTime > 0 && messageTime2 - messageTime > 360000) {
                        this.f91287d.f87877F.setVisibility(0);
                        this.f91287d.f87877F.setText(w0h.stampToDate(messageTime2));
                    }
                } else {
                    long messageTime3 = aiChatMessage.getMessageTime();
                    this.f91287d.f87877F.setVisibility(0);
                    this.f91287d.f87877F.setText(w0h.stampToDate(messageTime3));
                }
                if (this.f91293j && position == getItemCount() - 1) {
                    this.f91287d.f87885m.setVisibility(0);
                    AnimationDrawable animationDrawable = (AnimationDrawable) this.f91287d.f87880b.getDrawable();
                    this.f91294k = animationDrawable;
                    animationDrawable.start();
                } else {
                    this.f91287d.f87885m.setVisibility(8);
                }
                if (this.f91298o) {
                    this.f91287d.f87876C.setVisibility(0);
                    resolveThemeColor(hy2Var, C3993R.attr.imgbg);
                    if (aiChatMessageSelect.isSelect()) {
                        this.f91287d.f87876C.setImageResource(C3993R.drawable.ic_edit_select);
                    } else {
                        this.f91287d.f87876C.setImageResource(C3993R.drawable.ic_edit_unselect);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("isEditMode =========");
                    sb.append(this.f91298o);
                } else {
                    this.f91287d.f87876C.setVisibility(8);
                }
                this.f91287d.f87876C.setOnClickListener(new a(aiChatMessageSelect, position));
                this.f91287d.f87884f.setOnLongClickListener(new b());
                return;
            }
            if (!(holder instanceof j)) {
                if (holder instanceof l) {
                    this.f91289f = ((l) holder).f91325b;
                    ComponentCallbacks2C2485a.with(this.f91284a).load(aiChatMessage.getImagePath()).into(this.f91289f.f90873e);
                    if (this.f91293j && position == getItemCount() - 1) {
                        this.f91289f.f90872d.setVisibility(0);
                        AnimationDrawable animationDrawable2 = (AnimationDrawable) this.f91289f.f90870b.getDrawable();
                        this.f91294k = animationDrawable2;
                        animationDrawable2.start();
                    } else {
                        this.f91289f.f90872d.setVisibility(8);
                    }
                    if (this.f91298o) {
                        this.f91289f.f90874f.setVisibility(0);
                        resolveThemeColor(hy2Var, C3993R.attr.imgbg);
                        if (aiChatMessageSelect.isSelect()) {
                            this.f91289f.f90874f.setImageResource(C3993R.drawable.ic_edit_select);
                        } else {
                            this.f91289f.f90874f.setImageResource(C3993R.drawable.ic_edit_unselect);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("isEditMode =========");
                        sb2.append(this.f91298o);
                    } else {
                        this.f91289f.f90874f.setVisibility(8);
                    }
                    this.f91289f.f90874f.setOnClickListener(new g(aiChatMessageSelect, position));
                    this.f91289f.f90871c.setOnLongClickListener(new h());
                    this.f91289f.f90871c.setOnClickListener(new i(aiChatMessage));
                    return;
                }
                return;
            }
            this.f91288e = ((j) holder).f91320a;
            resolveThemeColor(hy2Var, C3993R.attr.imgbg);
            if (this.f91292i && position == getItemCount() - 1) {
                this.f91292i = false;
                this.f91288e.f62595m.setVisibility(8);
                this.f91288e.f62587H.setVisibility(8);
            } else {
                this.f91288e.f62595m.setVisibility(0);
                this.f91288e.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_play);
                if (TextUtils.isEmpty(aiChatMessage.getContent())) {
                    this.f91288e.f62587H.setVisibility(8);
                } else {
                    this.f91288e.f62587H.setVisibility(0);
                    MarkDownHelper.getInstance().setText(aiChatMessage.getContent(), this.f91288e.f62587H);
                    if (TextUtils.isEmpty(this.f91296m) || !TextUtils.equals(this.f91296m, aiChatMessage.getMsgId())) {
                        this.f91288e.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_play);
                    } else {
                        this.f91288e.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_pause);
                    }
                }
                this.f91288e.f62587H.setLineSpacing(1.2f, 1.3f);
                this.f91288e.f62586F.setLineSpacing(1.2f, 1.3f);
            }
            this.f91288e.f62595m.setOnClickListener(new c(position, aiChatMessage));
            this.f91288e.f62588L.setOnClickListener(new d(position, aiChatMessage));
            if (this.f91298o) {
                this.f91288e.f62590b.setVisibility(0);
                if (aiChatMessageSelect.isSelect()) {
                    this.f91288e.f62590b.setImageResource(C3993R.drawable.ic_edit_select);
                } else {
                    this.f91288e.f62590b.setImageResource(C3993R.drawable.ic_edit_unselect);
                }
            } else {
                this.f91288e.f62590b.setVisibility(8);
            }
            this.f91288e.f62590b.setOnClickListener(new e(aiChatMessageSelect, position));
            this.f91288e.f62592d.setOnLongClickListener(new f());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 1001) {
            this.f91287d = uf8.inflate(layoutInflaterFrom, parent, false);
            k kVar = new k(this.f91287d.getRoot(), this.f91285b);
            kVar.setBinding(this.f91287d);
            return kVar;
        }
        if (viewType == 1002) {
            this.f91289f = vf8.inflate(layoutInflaterFrom, parent, false);
            l lVar = new l(this.f91289f.getRoot(), this.f91285b);
            lVar.setBinding(this.f91289f);
            return lVar;
        }
        this.f91288e = mx1.inflate(layoutInflaterFrom, parent, false);
        j jVar = new j(this.f91288e.getRoot(), this.f91285b);
        jVar.setBinding(this.f91288e);
        return jVar;
    }

    public void removeSelectData() {
        ArrayList<AiChatMessageSelect> arrayList = this.f91286c;
        if (arrayList != null) {
            Iterator<AiChatMessageSelect> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f91299p = isSelect;
        ArrayList<AiChatMessageSelect> arrayList = this.f91286c;
        if (arrayList != null) {
            Iterator<AiChatMessageSelect> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setCurrentPlayingMsgId(String currentPlayingMsgId) {
        this.f91296m = currentPlayingMsgId;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentPlayingMsgId: ");
        sb.append(currentPlayingMsgId);
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<AiChatMessage> list, boolean isAnimation, boolean isPointAnimation) {
        this.f91292i = isAnimation;
        this.f91293j = isPointAnimation;
        ArrayList arrayList = new ArrayList();
        Iterator<AiChatMessage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AiChatMessageSelect(false, it.next()));
        }
        this.f91286c.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f91298o = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(m myItemClickListener) {
        this.f91285b = myItemClickListener;
    }

    public void setWorking(boolean working) {
        this.f91295l = working;
    }

    public void setmIsPointAnimation(boolean mIsPointAnimation) {
        this.f91293j = mIsPointAnimation;
        notifyDataSetChanged();
    }
}
