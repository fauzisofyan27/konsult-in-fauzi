package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityIndexFiturKarirPlanningBindingImpl extends ActivityIndexFiturKarirPlanningBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 9);
        sViewsWithIds.put(R.id.constraintIndexFiturKar, 10);
        sViewsWithIds.put(R.id.constraintFrame9, 11);
        sViewsWithIds.put(R.id.viewRectangle131, 12);
        sViewsWithIds.put(R.id.constraintRectangle68, 13);
        sViewsWithIds.put(R.id.toolbarToolbar, 14);
        sViewsWithIds.put(R.id.constraintGroup133, 15);
        sViewsWithIds.put(R.id.imageGroup65, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityIndexFiturKarirPlanningBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityIndexFiturKarirPlanningBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (androidx.appcompat.widget.Toolbar) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[12]
            );
        this.constraintGroup176.setTag(null);
        this.imageRectangle166.setTag(null);
        this.imageRectangle168.setTag(null);
        this.recyclerGroup134.setTag(null);
        this.recyclerGroup137.setTag(null);
        this.recyclerMenuBarisPert.setTag(null);
        this.txtArtikel.setTag(null);
        this.txtPersiapanKarir.setTag(null);
        this.txtRekomendasiHar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.indexFiturKarirPlanningVM == variableId) {
            setIndexFiturKarirPlanningVM((com.application.app.modules.indexfiturkarirplanning.data.viewmodel.IndexFiturKarirPlanningVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexFiturKarirPlanningVM(@Nullable com.application.app.modules.indexfiturkarirplanning.data.viewmodel.IndexFiturKarirPlanningVM IndexFiturKarirPlanningVM) {
        this.mIndexFiturKarirPlanningVM = IndexFiturKarirPlanningVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.indexFiturKarirPlanningVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIndexFiturKarirPlanningVMIndexFiturKarirPlanningModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.indexfiturkarirplanning.data.model.IndexFiturKarirPlanningModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIndexFiturKarirPlanningVMIndexFiturKarirPlanningModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.indexfiturkarirplanning.data.model.IndexFiturKarirPlanningModel> IndexFiturKarirPlanningVMIndexFiturKarirPlanningModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtPersiapanKarir = null;
        com.application.app.modules.indexfiturkarirplanning.data.model.IndexFiturKarirPlanningModel indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue = null;
        com.application.app.modules.indexfiturkarirplanning.data.viewmodel.IndexFiturKarirPlanningVM indexFiturKarirPlanningVM = mIndexFiturKarirPlanningVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.indexfiturkarirplanning.data.model.IndexFiturKarirPlanningModel> indexFiturKarirPlanningVMIndexFiturKarirPlanningModel = null;
        java.lang.String indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtRekomendasiHar = null;
        java.lang.String indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtArtikel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (indexFiturKarirPlanningVM != null) {
                    // read indexFiturKarirPlanningVM.indexFiturKarirPlanningModel
                    indexFiturKarirPlanningVMIndexFiturKarirPlanningModel = indexFiturKarirPlanningVM.getIndexFiturKarirPlanningModel();
                }
                updateLiveDataRegistration(0, indexFiturKarirPlanningVMIndexFiturKarirPlanningModel);


                if (indexFiturKarirPlanningVMIndexFiturKarirPlanningModel != null) {
                    // read indexFiturKarirPlanningVM.indexFiturKarirPlanningModel.getValue()
                    indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue = indexFiturKarirPlanningVMIndexFiturKarirPlanningModel.getValue();
                }


                if (indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue != null) {
                    // read indexFiturKarirPlanningVM.indexFiturKarirPlanningModel.getValue().txtPersiapanKarir
                    indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtPersiapanKarir = indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue.getTxtPersiapanKarir();
                    // read indexFiturKarirPlanningVM.indexFiturKarirPlanningModel.getValue().txtRekomendasiHar
                    indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtRekomendasiHar = indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue.getTxtRekomendasiHar();
                    // read indexFiturKarirPlanningVM.indexFiturKarirPlanningModel.getValue().txtArtikel
                    indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtArtikel = indexFiturKarirPlanningVMIndexFiturKarirPlanningModelGetValue.getTxtArtikel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle166, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle166.getContext(), R.drawable.img_rectangle166), imageRectangle166.getResources().getDimension(R.dimen._8pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle168, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle168.getContext(), R.drawable.img_rectangle168), imageRectangle168.getResources().getDimension(R.dimen._8pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerGroup134, recyclerGroup134.getResources().getDimension(R.dimen._16pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerGroup137, recyclerGroup137.getResources().getDimension(R.dimen._8pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerMenuBarisPert, recyclerMenuBarisPert.getResources().getDimension(R.dimen._16pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArtikel, indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtArtikel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPersiapanKarir, indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtPersiapanKarir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRekomendasiHar, indexFiturKarirPlanningVMIndexFiturKarirPlanningModelTxtRekomendasiHar);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexFiturKarirPlanningVM.indexFiturKarirPlanningModel
        flag 1 (0x2L): indexFiturKarirPlanningVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}