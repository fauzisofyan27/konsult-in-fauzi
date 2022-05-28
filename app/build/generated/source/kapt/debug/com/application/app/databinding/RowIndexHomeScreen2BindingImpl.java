package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowIndexHomeScreen2BindingImpl extends RowIndexHomeScreen2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewRectangle131, 4);
        sViewsWithIds.put(R.id.viewRectangle129, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowIndexHomeScreen2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowIndexHomeScreen2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[4]
            );
        this.constraintGroup.setTag(null);
        this.imageRectangle130.setTag(null);
        this.txtDataCenterAda.setTag(null);
        this.txtDataCenterPal.setTag(null);
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
        if (BR.indexHomeScreen2RowModel == variableId) {
            setIndexHomeScreen2RowModel((com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen2RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHomeScreen2RowModel(@Nullable com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen2RowModel IndexHomeScreen2RowModel) {
        this.mIndexHomeScreen2RowModel = IndexHomeScreen2RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.indexHomeScreen2RowModel);
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
        java.lang.String indexHomeScreen2RowModelTxtDataCenterAda = null;
        com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen2RowModel indexHomeScreen2RowModel = mIndexHomeScreen2RowModel;
        java.lang.String indexHomeScreen2RowModelTxtDataCenterPal = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (indexHomeScreen2RowModel != null) {
                    // read indexHomeScreen2RowModel.txtDataCenterAda
                    indexHomeScreen2RowModelTxtDataCenterAda = indexHomeScreen2RowModel.getTxtDataCenterAda();
                    // read indexHomeScreen2RowModel.txtDataCenterPal
                    indexHomeScreen2RowModelTxtDataCenterPal = indexHomeScreen2RowModel.getTxtDataCenterPal();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle130, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle130.getContext(), R.drawable.img_rectangle130), imageRectangle130.getResources().getDimension(R.dimen._8pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDataCenterAda, indexHomeScreen2RowModelTxtDataCenterAda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDataCenterPal, indexHomeScreen2RowModelTxtDataCenterPal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHomeScreen2RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}