package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySplashScreenBindingImpl extends ActivitySplashScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySplashScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivitySplashScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.constraintSplashScreen.setTag(null);
        this.imageEqweqwe1.setTag(null);
        this.txtKonsultasiDala.setTag(null);
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
        if (BR.splashScreenVM == variableId) {
            setSplashScreenVM((com.application.app.modules.splashscreen.data.viewmodel.SplashScreenVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSplashScreenVM(@Nullable com.application.app.modules.splashscreen.data.viewmodel.SplashScreenVM SplashScreenVM) {
        this.mSplashScreenVM = SplashScreenVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.splashScreenVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSplashScreenVMSplashScreenModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen.data.model.SplashScreenModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSplashScreenVMSplashScreenModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen.data.model.SplashScreenModel> SplashScreenVMSplashScreenModel, int fieldId) {
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
        com.application.app.modules.splashscreen.data.viewmodel.SplashScreenVM splashScreenVM = mSplashScreenVM;
        com.application.app.modules.splashscreen.data.model.SplashScreenModel splashScreenVMSplashScreenModelGetValue = null;
        java.lang.String splashScreenVMSplashScreenModelTxtKonsultasiDala = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen.data.model.SplashScreenModel> splashScreenVMSplashScreenModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (splashScreenVM != null) {
                    // read splashScreenVM.splashScreenModel
                    splashScreenVMSplashScreenModel = splashScreenVM.getSplashScreenModel();
                }
                updateLiveDataRegistration(0, splashScreenVMSplashScreenModel);


                if (splashScreenVMSplashScreenModel != null) {
                    // read splashScreenVM.splashScreenModel.getValue()
                    splashScreenVMSplashScreenModelGetValue = splashScreenVMSplashScreenModel.getValue();
                }


                if (splashScreenVMSplashScreenModelGetValue != null) {
                    // read splashScreenVM.splashScreenModel.getValue().txtKonsultasiDala
                    splashScreenVMSplashScreenModelTxtKonsultasiDala = splashScreenVMSplashScreenModelGetValue.getTxtKonsultasiDala();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEqweqwe1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEqweqwe1.getContext(), R.drawable.img_eqweqwe1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKonsultasiDala, splashScreenVMSplashScreenModelTxtKonsultasiDala);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): splashScreenVM.splashScreenModel
        flag 1 (0x2L): splashScreenVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}