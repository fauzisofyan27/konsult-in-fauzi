package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowIndexHomeScreen3BindingImpl extends RowIndexHomeScreen3Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnTambah, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowIndexHomeScreen3BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowIndexHomeScreen3BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.constraintGroup.setTag(null);
        this.imageRectangle182.setTag(null);
        this.txtBukuMindPlatt.setTag(null);
        this.txtRp100000.setTag(null);
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
        if (BR.indexHomeScreen3RowModel == variableId) {
            setIndexHomeScreen3RowModel((com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen3RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHomeScreen3RowModel(@Nullable com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen3RowModel IndexHomeScreen3RowModel) {
        this.mIndexHomeScreen3RowModel = IndexHomeScreen3RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.indexHomeScreen3RowModel);
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
        java.lang.String indexHomeScreen3RowModelTxtBukuMindPlatt = null;
        com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen3RowModel indexHomeScreen3RowModel = mIndexHomeScreen3RowModel;
        java.lang.String indexHomeScreen3RowModelTxtRp100000 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (indexHomeScreen3RowModel != null) {
                    // read indexHomeScreen3RowModel.txtBukuMindPlatt
                    indexHomeScreen3RowModelTxtBukuMindPlatt = indexHomeScreen3RowModel.getTxtBukuMindPlatt();
                    // read indexHomeScreen3RowModel.txtRp100000
                    indexHomeScreen3RowModelTxtRp100000 = indexHomeScreen3RowModel.getTxtRp100000();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle182, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle182.getContext(), R.drawable.img_rectangle182), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBukuMindPlatt, indexHomeScreen3RowModelTxtBukuMindPlatt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRp100000, indexHomeScreen3RowModelTxtRp100000);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHomeScreen3RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}