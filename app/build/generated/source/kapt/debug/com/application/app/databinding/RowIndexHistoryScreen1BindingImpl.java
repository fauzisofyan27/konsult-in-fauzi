package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowIndexHistoryScreen1BindingImpl extends RowIndexHistoryScreen1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageRectangle122, 7);
        sViewsWithIds.put(R.id.constraintGroup201, 8);
        sViewsWithIds.put(R.id.lineCoolicon, 9);
        sViewsWithIds.put(R.id.constraintGroup199, 10);
        sViewsWithIds.put(R.id.btnBerhasil, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowIndexHistoryScreen1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private RowIndexHistoryScreen1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.constraintGroup.setTag(null);
        this.imageRectangle123.setTag(null);
        this.txtKonsultasiPers.setTag(null);
        this.txtOlehRicardArc.setTag(null);
        this.txtRp50000.setTag(null);
        this.txtSenin9Mei20.setTag(null);
        this.txtTotalHarga.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.indexHistoryScreen1RowModel == variableId) {
            setIndexHistoryScreen1RowModel((com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreen1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHistoryScreen1RowModel(@Nullable com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreen1RowModel IndexHistoryScreen1RowModel) {
        this.mIndexHistoryScreen1RowModel = IndexHistoryScreen1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.indexHistoryScreen1RowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String indexHistoryScreen1RowModelTxtTotalHarga = null;
        com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreen1RowModel indexHistoryScreen1RowModel = mIndexHistoryScreen1RowModel;
        java.lang.String indexHistoryScreen1RowModelTxtOlehRicardArc = null;
        java.lang.String indexHistoryScreen1RowModelTxtKonsultasiPers = null;
        java.lang.String indexHistoryScreen1RowModelTxtRp50000 = null;
        java.lang.String indexHistoryScreen1RowModelTxtSenin9Mei20 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (indexHistoryScreen1RowModel != null) {
                    // read indexHistoryScreen1RowModel.txtTotalHarga
                    indexHistoryScreen1RowModelTxtTotalHarga = indexHistoryScreen1RowModel.getTxtTotalHarga();
                    // read indexHistoryScreen1RowModel.txtOlehRicardArc
                    indexHistoryScreen1RowModelTxtOlehRicardArc = indexHistoryScreen1RowModel.getTxtOlehRicardArc();
                    // read indexHistoryScreen1RowModel.txtKonsultasiPers
                    indexHistoryScreen1RowModelTxtKonsultasiPers = indexHistoryScreen1RowModel.getTxtKonsultasiPers();
                    // read indexHistoryScreen1RowModel.txtRp50000
                    indexHistoryScreen1RowModelTxtRp50000 = indexHistoryScreen1RowModel.getTxtRp50000();
                    // read indexHistoryScreen1RowModel.txtSenin9Mei20
                    indexHistoryScreen1RowModelTxtSenin9Mei20 = indexHistoryScreen1RowModel.getTxtSenin9Mei20();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle123, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle123.getContext(), R.drawable.img_rectangle123), imageRectangle123.getResources().getDimension(R.dimen._6pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKonsultasiPers, indexHistoryScreen1RowModelTxtKonsultasiPers);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOlehRicardArc, indexHistoryScreen1RowModelTxtOlehRicardArc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRp50000, indexHistoryScreen1RowModelTxtRp50000);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSenin9Mei20, indexHistoryScreen1RowModelTxtSenin9Mei20);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTotalHarga, indexHistoryScreen1RowModelTxtTotalHarga);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHistoryScreen1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}