package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityIndexHomeScreenBindingImpl extends ActivityIndexHomeScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 16);
        sViewsWithIds.put(R.id.constraintGroup111, 17);
        sViewsWithIds.put(R.id.constraintFrame9, 18);
        sViewsWithIds.put(R.id.constraintRectangle171, 19);
        sViewsWithIds.put(R.id.constraintGroup17, 20);
        sViewsWithIds.put(R.id.constraintGroup126, 21);
        sViewsWithIds.put(R.id.imageIcons, 22);
        sViewsWithIds.put(R.id.constraintGroup127, 23);
        sViewsWithIds.put(R.id.imageIcons1, 24);
        sViewsWithIds.put(R.id.constraintGroup11, 25);
        sViewsWithIds.put(R.id.imageGroup314, 26);
        sViewsWithIds.put(R.id.constraintGroup13, 27);
        sViewsWithIds.put(R.id.imageGroup315, 28);
        sViewsWithIds.put(R.id.constraintGroup15, 29);
        sViewsWithIds.put(R.id.imageUser, 30);
        sViewsWithIds.put(R.id.constraintRectangle34, 31);
        sViewsWithIds.put(R.id.toolbarToolbar, 32);
        sViewsWithIds.put(R.id.constraintGroup95, 33);
        sViewsWithIds.put(R.id.constraintGroup132, 34);
        sViewsWithIds.put(R.id.imageNotifications, 35);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityIndexHomeScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private ActivityIndexHomeScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[34]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[29]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[33]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[31]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[30]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[16]
            , (androidx.appcompat.widget.Toolbar) bindings[32]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            );
        this.constraintGroup130.setTag(null);
        this.imageEllipse4.setTag(null);
        this.imageRectangle166.setTag(null);
        this.imageRectangle168.setTag(null);
        this.recyclerGroup98.setTag(null);
        this.recyclerIndexHomeScreen.setTag(null);
        this.recyclerKatalog.setTag(null);
        this.txtAkun.setTag(null);
        this.txtArtikel.setTag(null);
        this.txtArtikel1.setTag(null);
        this.txtBeliin.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtHaloLeonardo.setTag(null);
        this.txtPilihKonsultas.setTag(null);
        this.txtRekomendasiHar.setTag(null);
        this.txtRiwayat.setTag(null);
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
        if (BR.indexHomeScreenVM == variableId) {
            setIndexHomeScreenVM((com.application.app.modules.indexhomescreen.data.viewmodel.IndexHomeScreenVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHomeScreenVM(@Nullable com.application.app.modules.indexhomescreen.data.viewmodel.IndexHomeScreenVM IndexHomeScreenVM) {
        this.mIndexHomeScreenVM = IndexHomeScreenVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.indexHomeScreenVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIndexHomeScreenVMIndexHomeScreenModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhomescreen.data.model.IndexHomeScreenModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIndexHomeScreenVMIndexHomeScreenModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhomescreen.data.model.IndexHomeScreenModel> IndexHomeScreenVMIndexHomeScreenModel, int fieldId) {
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
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtBeliin = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtAkun = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtRekomendasiHar = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtRiwayat = null;
        com.application.app.modules.indexhomescreen.data.model.IndexHomeScreenModel indexHomeScreenVMIndexHomeScreenModelGetValue = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtHaloLeonardo = null;
        com.application.app.modules.indexhomescreen.data.viewmodel.IndexHomeScreenVM indexHomeScreenVM = mIndexHomeScreenVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhomescreen.data.model.IndexHomeScreenModel> indexHomeScreenVMIndexHomeScreenModel = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtArtikel = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtBeranda = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtArtikel1 = null;
        java.lang.String indexHomeScreenVMIndexHomeScreenModelTxtPilihKonsultas = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (indexHomeScreenVM != null) {
                    // read indexHomeScreenVM.indexHomeScreenModel
                    indexHomeScreenVMIndexHomeScreenModel = indexHomeScreenVM.getIndexHomeScreenModel();
                }
                updateLiveDataRegistration(0, indexHomeScreenVMIndexHomeScreenModel);


                if (indexHomeScreenVMIndexHomeScreenModel != null) {
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue()
                    indexHomeScreenVMIndexHomeScreenModelGetValue = indexHomeScreenVMIndexHomeScreenModel.getValue();
                }


                if (indexHomeScreenVMIndexHomeScreenModelGetValue != null) {
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtBeliin
                    indexHomeScreenVMIndexHomeScreenModelTxtBeliin = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtBeliin();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtAkun
                    indexHomeScreenVMIndexHomeScreenModelTxtAkun = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtAkun();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtRekomendasiHar
                    indexHomeScreenVMIndexHomeScreenModelTxtRekomendasiHar = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtRekomendasiHar();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtRiwayat
                    indexHomeScreenVMIndexHomeScreenModelTxtRiwayat = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtRiwayat();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtHaloLeonardo
                    indexHomeScreenVMIndexHomeScreenModelTxtHaloLeonardo = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtHaloLeonardo();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtArtikel
                    indexHomeScreenVMIndexHomeScreenModelTxtArtikel = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtArtikel();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtBeranda
                    indexHomeScreenVMIndexHomeScreenModelTxtBeranda = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtBeranda();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtArtikel1
                    indexHomeScreenVMIndexHomeScreenModelTxtArtikel1 = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtArtikel1();
                    // read indexHomeScreenVM.indexHomeScreenModel.getValue().txtPilihKonsultas
                    indexHomeScreenVMIndexHomeScreenModelTxtPilihKonsultas = indexHomeScreenVMIndexHomeScreenModelGetValue.getTxtPilihKonsultas();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipse4, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipse4.getContext(), R.drawable.img_ellipse4), (float)0f, true);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle166, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle166.getContext(), R.drawable.img_rectangle166), imageRectangle166.getResources().getDimension(R.dimen._8pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle168, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle168.getContext(), R.drawable.img_rectangle168), imageRectangle168.getResources().getDimension(R.dimen._8pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerGroup98, recyclerGroup98.getResources().getDimension(R.dimen._16pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerIndexHomeScreen, recyclerIndexHomeScreen.getResources().getDimension(R.dimen._16pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerKatalog, recyclerKatalog.getResources().getDimension(R.dimen._16pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkun, indexHomeScreenVMIndexHomeScreenModelTxtAkun);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArtikel, indexHomeScreenVMIndexHomeScreenModelTxtArtikel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArtikel1, indexHomeScreenVMIndexHomeScreenModelTxtArtikel1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeliin, indexHomeScreenVMIndexHomeScreenModelTxtBeliin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, indexHomeScreenVMIndexHomeScreenModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHaloLeonardo, indexHomeScreenVMIndexHomeScreenModelTxtHaloLeonardo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPilihKonsultas, indexHomeScreenVMIndexHomeScreenModelTxtPilihKonsultas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRekomendasiHar, indexHomeScreenVMIndexHomeScreenModelTxtRekomendasiHar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRiwayat, indexHomeScreenVMIndexHomeScreenModelTxtRiwayat);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHomeScreenVM.indexHomeScreenModel
        flag 1 (0x2L): indexHomeScreenVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}