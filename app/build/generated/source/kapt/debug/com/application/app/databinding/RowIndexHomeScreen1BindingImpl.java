package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowIndexHomeScreen1BindingImpl extends RowIndexHomeScreen1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageGroup306, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowIndexHomeScreen1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RowIndexHomeScreen1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintMenuPersiapan.setTag(null);
        this.txtPersiapanKarir.setTag(null);
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
        if (BR.indexHomeScreen1RowModel == variableId) {
            setIndexHomeScreen1RowModel((com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHomeScreen1RowModel(@Nullable com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen1RowModel IndexHomeScreen1RowModel) {
        this.mIndexHomeScreen1RowModel = IndexHomeScreen1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.indexHomeScreen1RowModel);
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
        com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen1RowModel indexHomeScreen1RowModel = mIndexHomeScreen1RowModel;
        java.lang.String indexHomeScreen1RowModelTxtPersiapanKarir = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (indexHomeScreen1RowModel != null) {
                    // read indexHomeScreen1RowModel.txtPersiapanKarir
                    indexHomeScreen1RowModelTxtPersiapanKarir = indexHomeScreen1RowModel.getTxtPersiapanKarir();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPersiapanKarir, indexHomeScreen1RowModelTxtPersiapanKarir);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHomeScreen1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}