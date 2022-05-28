package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPilihKonsultanBindingImpl extends ActivityPilihKonsultanBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintRectangle68, 4);
        sViewsWithIds.put(R.id.toolbarToolbar, 5);
        sViewsWithIds.put(R.id.constraintGroup178, 6);
        sViewsWithIds.put(R.id.imageGroup65, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCariKonsultanandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of pilihKonsultanVM.pilihKonsultanModel.getValue().etCariKonsultanValue
            //         is pilihKonsultanVM.pilihKonsultanModel.getValue().setEtCariKonsultanValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCariKonsultan);
            // localize variables for thread safety
            // pilihKonsultanVM.pilihKonsultanModel != null
            boolean pilihKonsultanVMPilihKonsultanModelJavaLangObjectNull = false;
            // pilihKonsultanVM.pilihKonsultanModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel> pilihKonsultanVMPilihKonsultanModel = null;
            // pilihKonsultanVM
            com.application.app.modules.pilihkonsultan.data.viewmodel.PilihKonsultanVM pilihKonsultanVM = mPilihKonsultanVM;
            // pilihKonsultanVM != null
            boolean pilihKonsultanVMJavaLangObjectNull = false;
            // pilihKonsultanVM.pilihKonsultanModel.getValue()
            com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel pilihKonsultanVMPilihKonsultanModelGetValue = null;
            // pilihKonsultanVM.pilihKonsultanModel.getValue().etCariKonsultanValue
            java.lang.String pilihKonsultanVMPilihKonsultanModelEtCariKonsultanValue = null;
            // pilihKonsultanVM.pilihKonsultanModel.getValue() != null
            boolean pilihKonsultanVMPilihKonsultanModelGetValueJavaLangObjectNull = false;



            pilihKonsultanVMJavaLangObjectNull = (pilihKonsultanVM) != (null);
            if (pilihKonsultanVMJavaLangObjectNull) {


                pilihKonsultanVMPilihKonsultanModel = pilihKonsultanVM.getPilihKonsultanModel();

                pilihKonsultanVMPilihKonsultanModelJavaLangObjectNull = (pilihKonsultanVMPilihKonsultanModel) != (null);
                if (pilihKonsultanVMPilihKonsultanModelJavaLangObjectNull) {


                    pilihKonsultanVMPilihKonsultanModelGetValue = pilihKonsultanVMPilihKonsultanModel.getValue();

                    pilihKonsultanVMPilihKonsultanModelGetValueJavaLangObjectNull = (pilihKonsultanVMPilihKonsultanModelGetValue) != (null);
                    if (pilihKonsultanVMPilihKonsultanModelGetValueJavaLangObjectNull) {




                        pilihKonsultanVMPilihKonsultanModelGetValue.setEtCariKonsultanValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityPilihKonsultanBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityPilihKonsultanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.constraintPilihKonsultan.setTag(null);
        this.etCariKonsultan.setTag(null);
        this.recyclerPilihKonsultan.setTag(null);
        this.txtPersiapanKarir.setTag(null);
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
        if (BR.pilihKonsultanVM == variableId) {
            setPilihKonsultanVM((com.application.app.modules.pilihkonsultan.data.viewmodel.PilihKonsultanVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPilihKonsultanVM(@Nullable com.application.app.modules.pilihkonsultan.data.viewmodel.PilihKonsultanVM PilihKonsultanVM) {
        this.mPilihKonsultanVM = PilihKonsultanVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pilihKonsultanVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePilihKonsultanVMPilihKonsultanModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePilihKonsultanVMPilihKonsultanModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel> PilihKonsultanVMPilihKonsultanModel, int fieldId) {
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
        com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel pilihKonsultanVMPilihKonsultanModelGetValue = null;
        java.lang.String pilihKonsultanVMPilihKonsultanModelEtCariKonsultanValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.pilihkonsultan.data.model.PilihKonsultanModel> pilihKonsultanVMPilihKonsultanModel = null;
        com.application.app.modules.pilihkonsultan.data.viewmodel.PilihKonsultanVM pilihKonsultanVM = mPilihKonsultanVM;
        java.lang.String pilihKonsultanVMPilihKonsultanModelTxtPersiapanKarir = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (pilihKonsultanVM != null) {
                    // read pilihKonsultanVM.pilihKonsultanModel
                    pilihKonsultanVMPilihKonsultanModel = pilihKonsultanVM.getPilihKonsultanModel();
                }
                updateLiveDataRegistration(0, pilihKonsultanVMPilihKonsultanModel);


                if (pilihKonsultanVMPilihKonsultanModel != null) {
                    // read pilihKonsultanVM.pilihKonsultanModel.getValue()
                    pilihKonsultanVMPilihKonsultanModelGetValue = pilihKonsultanVMPilihKonsultanModel.getValue();
                }


                if (pilihKonsultanVMPilihKonsultanModelGetValue != null) {
                    // read pilihKonsultanVM.pilihKonsultanModel.getValue().etCariKonsultanValue
                    pilihKonsultanVMPilihKonsultanModelEtCariKonsultanValue = pilihKonsultanVMPilihKonsultanModelGetValue.getEtCariKonsultanValue();
                    // read pilihKonsultanVM.pilihKonsultanModel.getValue().txtPersiapanKarir
                    pilihKonsultanVMPilihKonsultanModelTxtPersiapanKarir = pilihKonsultanVMPilihKonsultanModelGetValue.getTxtPersiapanKarir();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCariKonsultan, pilihKonsultanVMPilihKonsultanModelEtCariKonsultanValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPersiapanKarir, pilihKonsultanVMPilihKonsultanModelTxtPersiapanKarir);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCariKonsultan, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCariKonsultanandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerPilihKonsultan, recyclerPilihKonsultan.getResources().getDimension(R.dimen._16pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pilihKonsultanVM.pilihKonsultanModel
        flag 1 (0x2L): pilihKonsultanVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}