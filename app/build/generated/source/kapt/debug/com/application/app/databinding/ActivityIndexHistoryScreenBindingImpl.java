package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityIndexHistoryScreenBindingImpl extends ActivityIndexHistoryScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintButton, 12);
        sViewsWithIds.put(R.id.btnSemua, 13);
        sViewsWithIds.put(R.id.constraintRectangle171, 14);
        sViewsWithIds.put(R.id.constraintGroup29, 15);
        sViewsWithIds.put(R.id.constraintGroup226, 16);
        sViewsWithIds.put(R.id.imageIcons, 17);
        sViewsWithIds.put(R.id.constraintGroup227, 18);
        sViewsWithIds.put(R.id.imageIcons1, 19);
        sViewsWithIds.put(R.id.constraintGroup23, 20);
        sViewsWithIds.put(R.id.imageGroup314, 21);
        sViewsWithIds.put(R.id.constraintGroup25, 22);
        sViewsWithIds.put(R.id.imageGroup315, 23);
        sViewsWithIds.put(R.id.constraintGroup27, 24);
        sViewsWithIds.put(R.id.imageUser, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCariTransaksiandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of indexHistoryScreenVM.indexHistoryScreenModel.getValue().etCariTransaksiValue
            //         is indexHistoryScreenVM.indexHistoryScreenModel.getValue().setEtCariTransaksiValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCariTransaksi);
            // localize variables for thread safety
            // indexHistoryScreenVM.indexHistoryScreenModel.getValue().etCariTransaksiValue
            java.lang.String indexHistoryScreenVMIndexHistoryScreenModelEtCariTransaksiValue = null;
            // indexHistoryScreenVM.indexHistoryScreenModel.getValue()
            com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel indexHistoryScreenVMIndexHistoryScreenModelGetValue = null;
            // indexHistoryScreenVM != null
            boolean indexHistoryScreenVMJavaLangObjectNull = false;
            // indexHistoryScreenVM.indexHistoryScreenModel.getValue() != null
            boolean indexHistoryScreenVMIndexHistoryScreenModelGetValueJavaLangObjectNull = false;
            // indexHistoryScreenVM.indexHistoryScreenModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel> indexHistoryScreenVMIndexHistoryScreenModel = null;
            // indexHistoryScreenVM
            com.application.app.modules.indexhistoryscreen.data.viewmodel.IndexHistoryScreenVM indexHistoryScreenVM = mIndexHistoryScreenVM;
            // indexHistoryScreenVM.indexHistoryScreenModel != null
            boolean indexHistoryScreenVMIndexHistoryScreenModelJavaLangObjectNull = false;



            indexHistoryScreenVMJavaLangObjectNull = (indexHistoryScreenVM) != (null);
            if (indexHistoryScreenVMJavaLangObjectNull) {


                indexHistoryScreenVMIndexHistoryScreenModel = indexHistoryScreenVM.getIndexHistoryScreenModel();

                indexHistoryScreenVMIndexHistoryScreenModelJavaLangObjectNull = (indexHistoryScreenVMIndexHistoryScreenModel) != (null);
                if (indexHistoryScreenVMIndexHistoryScreenModelJavaLangObjectNull) {


                    indexHistoryScreenVMIndexHistoryScreenModelGetValue = indexHistoryScreenVMIndexHistoryScreenModel.getValue();

                    indexHistoryScreenVMIndexHistoryScreenModelGetValueJavaLangObjectNull = (indexHistoryScreenVMIndexHistoryScreenModelGetValue) != (null);
                    if (indexHistoryScreenVMIndexHistoryScreenModelGetValueJavaLangObjectNull) {




                        indexHistoryScreenVMIndexHistoryScreenModelGetValue.setEtCariTransaksiValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityIndexHistoryScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityIndexHistoryScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.constraintIndexhistoryS.setTag(null);
        this.etCariTransaksi.setTag(null);
        this.recyclerIndexHistoryScreen.setTag(null);
        this.txtAkun.setTag(null);
        this.txtArtikel.setTag(null);
        this.txtBeliin.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtBerhasil.setTag(null);
        this.txtGagal.setTag(null);
        this.txtMenunggu.setTag(null);
        this.txtRiwayat.setTag(null);
        this.txtRiwayatTransak.setTag(null);
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
        if (BR.indexHistoryScreenVM == variableId) {
            setIndexHistoryScreenVM((com.application.app.modules.indexhistoryscreen.data.viewmodel.IndexHistoryScreenVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndexHistoryScreenVM(@Nullable com.application.app.modules.indexhistoryscreen.data.viewmodel.IndexHistoryScreenVM IndexHistoryScreenVM) {
        this.mIndexHistoryScreenVM = IndexHistoryScreenVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.indexHistoryScreenVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIndexHistoryScreenVMIndexHistoryScreenModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIndexHistoryScreenVMIndexHistoryScreenModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel> IndexHistoryScreenVMIndexHistoryScreenModel, int fieldId) {
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
        com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel indexHistoryScreenVMIndexHistoryScreenModelGetValue = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtGagal = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelEtCariTransaksiValue = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayatTransak = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.indexhistoryscreen.data.model.IndexHistoryScreenModel> indexHistoryScreenVMIndexHistoryScreenModel = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtMenunggu = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtArtikel = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtBeranda = null;
        com.application.app.modules.indexhistoryscreen.data.viewmodel.IndexHistoryScreenVM indexHistoryScreenVM = mIndexHistoryScreenVM;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtBerhasil = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayat = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtBeliin = null;
        java.lang.String indexHistoryScreenVMIndexHistoryScreenModelTxtAkun = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (indexHistoryScreenVM != null) {
                    // read indexHistoryScreenVM.indexHistoryScreenModel
                    indexHistoryScreenVMIndexHistoryScreenModel = indexHistoryScreenVM.getIndexHistoryScreenModel();
                }
                updateLiveDataRegistration(0, indexHistoryScreenVMIndexHistoryScreenModel);


                if (indexHistoryScreenVMIndexHistoryScreenModel != null) {
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue()
                    indexHistoryScreenVMIndexHistoryScreenModelGetValue = indexHistoryScreenVMIndexHistoryScreenModel.getValue();
                }


                if (indexHistoryScreenVMIndexHistoryScreenModelGetValue != null) {
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtGagal
                    indexHistoryScreenVMIndexHistoryScreenModelTxtGagal = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtGagal();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().etCariTransaksiValue
                    indexHistoryScreenVMIndexHistoryScreenModelEtCariTransaksiValue = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getEtCariTransaksiValue();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtRiwayatTransak
                    indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayatTransak = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtRiwayatTransak();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtMenunggu
                    indexHistoryScreenVMIndexHistoryScreenModelTxtMenunggu = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtMenunggu();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtArtikel
                    indexHistoryScreenVMIndexHistoryScreenModelTxtArtikel = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtArtikel();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtBeranda
                    indexHistoryScreenVMIndexHistoryScreenModelTxtBeranda = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtBeranda();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtBerhasil
                    indexHistoryScreenVMIndexHistoryScreenModelTxtBerhasil = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtBerhasil();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtRiwayat
                    indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayat = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtRiwayat();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtBeliin
                    indexHistoryScreenVMIndexHistoryScreenModelTxtBeliin = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtBeliin();
                    // read indexHistoryScreenVM.indexHistoryScreenModel.getValue().txtAkun
                    indexHistoryScreenVMIndexHistoryScreenModelTxtAkun = indexHistoryScreenVMIndexHistoryScreenModelGetValue.getTxtAkun();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCariTransaksi, indexHistoryScreenVMIndexHistoryScreenModelEtCariTransaksiValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkun, indexHistoryScreenVMIndexHistoryScreenModelTxtAkun);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArtikel, indexHistoryScreenVMIndexHistoryScreenModelTxtArtikel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeliin, indexHistoryScreenVMIndexHistoryScreenModelTxtBeliin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, indexHistoryScreenVMIndexHistoryScreenModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBerhasil, indexHistoryScreenVMIndexHistoryScreenModelTxtBerhasil);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGagal, indexHistoryScreenVMIndexHistoryScreenModelTxtGagal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMenunggu, indexHistoryScreenVMIndexHistoryScreenModelTxtMenunggu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRiwayat, indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRiwayatTransak, indexHistoryScreenVMIndexHistoryScreenModelTxtRiwayatTransak);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCariTransaksi, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCariTransaksiandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerIndexHistoryScreen, recyclerIndexHistoryScreen.getResources().getDimension(R.dimen._16pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): indexHistoryScreenVM.indexHistoryScreenModel
        flag 1 (0x2L): indexHistoryScreenVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}