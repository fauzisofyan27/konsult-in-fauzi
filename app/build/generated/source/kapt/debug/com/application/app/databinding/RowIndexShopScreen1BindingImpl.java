package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowIndexShopScreen1BindingImpl extends RowIndexShopScreen1Binding  {

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

    public RowIndexShopScreen1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowIndexShopScreen1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.indexShopScreen1RowModel == variableId) {
            setIndexShopScreen1RowModel((com.application.app.modules.indexshopscreen.data.model.IndexShopScreen1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexShopScreen1RowModel(@Nullable com.application.app.modules.indexshopscreen.data.model.IndexShopScreen1RowModel IndexShopScreen1RowModel) {
        this.mIndexShopScreen1RowModel = IndexShopScreen1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.indexShopScreen1RowModel);
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
        java.lang.String indexShopScreen1RowModelTxtRp100000 = null;
        com.application.app.modules.indexshopscreen.data.model.IndexShopScreen1RowModel indexShopScreen1RowModel = mIndexShopScreen1RowModel;
        java.lang.String indexShopScreen1RowModelTxtBukuMindPlatt = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (indexShopScreen1RowModel != null) {
                    // read indexShopScreen1RowModel.txtRp100000
                    indexShopScreen1RowModelTxtRp100000 = indexShopScreen1RowModel.getTxtRp100000();
                    // read indexShopScreen1RowModel.txtBukuMindPlatt
                    indexShopScreen1RowModelTxtBukuMindPlatt = indexShopScreen1RowModel.getTxtBukuMindPlatt();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle182, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle182.getContext(), R.drawable.img_rectangle182), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBukuMindPlatt, indexShopScreen1RowModelTxtBukuMindPlatt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRp100000, indexShopScreen1RowModelTxtRp100000);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexShopScreen1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}