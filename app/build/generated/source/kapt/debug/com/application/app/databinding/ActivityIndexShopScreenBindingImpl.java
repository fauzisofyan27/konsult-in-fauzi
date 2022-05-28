package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityIndexShopScreenBindingImpl extends ActivityIndexShopScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 12);
        sViewsWithIds.put(R.id.constraintGroup250, 13);
        sViewsWithIds.put(R.id.constraintGroup247, 14);
        sViewsWithIds.put(R.id.btnTambah, 15);
        sViewsWithIds.put(R.id.constraintButton, 16);
        sViewsWithIds.put(R.id.btnKarir, 17);
        sViewsWithIds.put(R.id.btnKesehatan, 18);
        sViewsWithIds.put(R.id.btnKeuangan, 19);
        sViewsWithIds.put(R.id.btnSemua, 20);
        sViewsWithIds.put(R.id.constraintRectangle171, 21);
        sViewsWithIds.put(R.id.constraintGroup41, 22);
        sViewsWithIds.put(R.id.constraintGroup255, 23);
        sViewsWithIds.put(R.id.imageIcons, 24);
        sViewsWithIds.put(R.id.constraintGroup256, 25);
        sViewsWithIds.put(R.id.imageIcons1, 26);
        sViewsWithIds.put(R.id.constraintGroup35, 27);
        sViewsWithIds.put(R.id.imageGroup314, 28);
        sViewsWithIds.put(R.id.constraintGroup37, 29);
        sViewsWithIds.put(R.id.imageGroup315, 30);
        sViewsWithIds.put(R.id.constraintGroup39, 31);
        sViewsWithIds.put(R.id.imageUser, 32);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCariBarangandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of indexShopScreenVM.indexShopScreenModel.getValue().etCariBarangValue
            //         is indexShopScreenVM.indexShopScreenModel.getValue().setEtCariBarangValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCariBarang);
            // localize variables for thread safety
            // indexShopScreenVM.indexShopScreenModel.getValue()
            com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel indexShopScreenVMIndexShopScreenModelGetValue = null;
            // indexShopScreenVM.indexShopScreenModel.getValue().etCariBarangValue
            java.lang.String indexShopScreenVMIndexShopScreenModelEtCariBarangValue = null;
            // indexShopScreenVM != null
            boolean indexShopScreenVMJavaLangObjectNull = false;
            // indexShopScreenVM
            com.application.app.modules.indexshopscreen.data.viewmodel.IndexShopScreenVM indexShopScreenVM = mIndexShopScreenVM;
            // indexShopScreenVM.indexShopScreenModel != null
            boolean indexShopScreenVMIndexShopScreenModelJavaLangObjectNull = false;
            // indexShopScreenVM.indexShopScreenModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel> indexShopScreenVMIndexShopScreenModel = null;
            // indexShopScreenVM.indexShopScreenModel.getValue() != null
            boolean indexShopScreenVMIndexShopScreenModelGetValueJavaLangObjectNull = false;



            indexShopScreenVMJavaLangObjectNull = (indexShopScreenVM) != (null);
            if (indexShopScreenVMJavaLangObjectNull) {


                indexShopScreenVMIndexShopScreenModel = indexShopScreenVM.getIndexShopScreenModel();

                indexShopScreenVMIndexShopScreenModelJavaLangObjectNull = (indexShopScreenVMIndexShopScreenModel) != (null);
                if (indexShopScreenVMIndexShopScreenModelJavaLangObjectNull) {


                    indexShopScreenVMIndexShopScreenModelGetValue = indexShopScreenVMIndexShopScreenModel.getValue();

                    indexShopScreenVMIndexShopScreenModelGetValueJavaLangObjectNull = (indexShopScreenVMIndexShopScreenModelGetValue) != (null);
                    if (indexShopScreenVMIndexShopScreenModelGetValueJavaLangObjectNull) {




                        indexShopScreenVMIndexShopScreenModelGetValue.setEtCariBarangValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityIndexShopScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityIndexShopScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (androidx.appcompat.widget.AppCompatButton) bindings[19]
            , (androidx.appcompat.widget.AppCompatButton) bindings[20]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[29]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            );
        this.constraintGroup258.setTag(null);
        this.etCariBarang.setTag(null);
        this.imageRectangle182.setTag(null);
        this.recyclerIndexShopScreen.setTag(null);
        this.txtAkun.setTag(null);
        this.txtArtikel.setTag(null);
        this.txtBeliin.setTag(null);
        this.txtBeliin1.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtBukuMindPlatt.setTag(null);
        this.txtRiwayat.setTag(null);
        this.txtRp100000.setTag(null);
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
        if (BR.indexShopScreenVM == variableId) {
            setIndexShopScreenVM((com.application.app.modules.indexshopscreen.data.viewmodel.IndexShopScreenVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexShopScreenVM(@Nullable com.application.app.modules.indexshopscreen.data.viewmodel.IndexShopScreenVM IndexShopScreenVM) {
        this.mIndexShopScreenVM = IndexShopScreenVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.indexShopScreenVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIndexShopScreenVMIndexShopScreenModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIndexShopScreenVMIndexShopScreenModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel> IndexShopScreenVMIndexShopScreenModel, int fieldId) {
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
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtBeliin = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel> indexShopScreenVMIndexShopScreenModel = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelEtCariBarangValue = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtBeliin1 = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtArtikel = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtBeranda = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtRiwayat = null;
        com.application.app.modules.indexshopscreen.data.viewmodel.IndexShopScreenVM indexShopScreenVM = mIndexShopScreenVM;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtAkun = null;
        com.application.app.modules.indexshopscreen.data.model.IndexShopScreenModel indexShopScreenVMIndexShopScreenModelGetValue = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtRp100000 = null;
        java.lang.String indexShopScreenVMIndexShopScreenModelTxtBukuMindPlatt = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (indexShopScreenVM != null) {
                    // read indexShopScreenVM.indexShopScreenModel
                    indexShopScreenVMIndexShopScreenModel = indexShopScreenVM.getIndexShopScreenModel();
                }
                updateLiveDataRegistration(0, indexShopScreenVMIndexShopScreenModel);


                if (indexShopScreenVMIndexShopScreenModel != null) {
                    // read indexShopScreenVM.indexShopScreenModel.getValue()
                    indexShopScreenVMIndexShopScreenModelGetValue = indexShopScreenVMIndexShopScreenModel.getValue();
                }


                if (indexShopScreenVMIndexShopScreenModelGetValue != null) {
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtBeliin
                    indexShopScreenVMIndexShopScreenModelTxtBeliin = indexShopScreenVMIndexShopScreenModelGetValue.getTxtBeliin();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().etCariBarangValue
                    indexShopScreenVMIndexShopScreenModelEtCariBarangValue = indexShopScreenVMIndexShopScreenModelGetValue.getEtCariBarangValue();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtBeliin1
                    indexShopScreenVMIndexShopScreenModelTxtBeliin1 = indexShopScreenVMIndexShopScreenModelGetValue.getTxtBeliin1();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtArtikel
                    indexShopScreenVMIndexShopScreenModelTxtArtikel = indexShopScreenVMIndexShopScreenModelGetValue.getTxtArtikel();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtBeranda
                    indexShopScreenVMIndexShopScreenModelTxtBeranda = indexShopScreenVMIndexShopScreenModelGetValue.getTxtBeranda();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtRiwayat
                    indexShopScreenVMIndexShopScreenModelTxtRiwayat = indexShopScreenVMIndexShopScreenModelGetValue.getTxtRiwayat();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtAkun
                    indexShopScreenVMIndexShopScreenModelTxtAkun = indexShopScreenVMIndexShopScreenModelGetValue.getTxtAkun();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtRp100000
                    indexShopScreenVMIndexShopScreenModelTxtRp100000 = indexShopScreenVMIndexShopScreenModelGetValue.getTxtRp100000();
                    // read indexShopScreenVM.indexShopScreenModel.getValue().txtBukuMindPlatt
                    indexShopScreenVMIndexShopScreenModelTxtBukuMindPlatt = indexShopScreenVMIndexShopScreenModelGetValue.getTxtBukuMindPlatt();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCariBarang, indexShopScreenVMIndexShopScreenModelEtCariBarangValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkun, indexShopScreenVMIndexShopScreenModelTxtAkun);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArtikel, indexShopScreenVMIndexShopScreenModelTxtArtikel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeliin, indexShopScreenVMIndexShopScreenModelTxtBeliin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeliin1, indexShopScreenVMIndexShopScreenModelTxtBeliin1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, indexShopScreenVMIndexShopScreenModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBukuMindPlatt, indexShopScreenVMIndexShopScreenModelTxtBukuMindPlatt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRiwayat, indexShopScreenVMIndexShopScreenModelTxtRiwayat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRp100000, indexShopScreenVMIndexShopScreenModelTxtRp100000);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCariBarang, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCariBarangandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle182, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle182.getContext(), R.drawable.img_rectangle182), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerIndexShopScreen, recyclerIndexShopScreen.getResources().getDimension(R.dimen._8pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexShopScreenVM.indexShopScreenModel
        flag 1 (0x2L): indexShopScreenVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}