package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySplashScreen2BindingImpl extends ActivitySplashScreen2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintSplashScreen2, 4);
        sViewsWithIds.put(R.id.imageIlust, 5);
        sViewsWithIds.put(R.id.constraintNav, 6);
        sViewsWithIds.put(R.id.indicatorGroup48, 7);
        sViewsWithIds.put(R.id.floatingBtnFloatingactionbutton, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySplashScreen2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivitySplashScreen2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (com.asksira.loopingviewpager.indicator.CustomShapePagerIndicator) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.constraintGroup260.setTag(null);
        this.txtKamiSangatSen.setTag(null);
        this.txtSelamatDatang.setTag(null);
        this.txtSkip.setTag(null);
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
        if (BR.splashScreen2VM == variableId) {
            setSplashScreen2VM((com.application.app.modules.splashscreen2.data.viewmodel.SplashScreen2VM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSplashScreen2VM(@Nullable com.application.app.modules.splashscreen2.data.viewmodel.SplashScreen2VM SplashScreen2VM) {
        this.mSplashScreen2VM = SplashScreen2VM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.splashScreen2VM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSplashScreen2VMSplashScreen2Model((androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen2.data.model.SplashScreen2Model>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSplashScreen2VMSplashScreen2Model(androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen2.data.model.SplashScreen2Model> SplashScreen2VMSplashScreen2Model, int fieldId) {
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
        com.application.app.modules.splashscreen2.data.viewmodel.SplashScreen2VM splashScreen2VM = mSplashScreen2VM;
        java.lang.String splashScreen2VMSplashScreen2ModelTxtSelamatDatang = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.splashscreen2.data.model.SplashScreen2Model> splashScreen2VMSplashScreen2Model = null;
        java.lang.String splashScreen2VMSplashScreen2ModelTxtKamiSangatSen = null;
        java.lang.String splashScreen2VMSplashScreen2ModelTxtSkip = null;
        com.application.app.modules.splashscreen2.data.model.SplashScreen2Model splashScreen2VMSplashScreen2ModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (splashScreen2VM != null) {
                    // read splashScreen2VM.splashScreen2Model
                    splashScreen2VMSplashScreen2Model = splashScreen2VM.getSplashScreen2Model();
                }
                updateLiveDataRegistration(0, splashScreen2VMSplashScreen2Model);


                if (splashScreen2VMSplashScreen2Model != null) {
                    // read splashScreen2VM.splashScreen2Model.getValue()
                    splashScreen2VMSplashScreen2ModelGetValue = splashScreen2VMSplashScreen2Model.getValue();
                }


                if (splashScreen2VMSplashScreen2ModelGetValue != null) {
                    // read splashScreen2VM.splashScreen2Model.getValue().txtSelamatDatang
                    splashScreen2VMSplashScreen2ModelTxtSelamatDatang = splashScreen2VMSplashScreen2ModelGetValue.getTxtSelamatDatang();
                    // read splashScreen2VM.splashScreen2Model.getValue().txtKamiSangatSen
                    splashScreen2VMSplashScreen2ModelTxtKamiSangatSen = splashScreen2VMSplashScreen2ModelGetValue.getTxtKamiSangatSen();
                    // read splashScreen2VM.splashScreen2Model.getValue().txtSkip
                    splashScreen2VMSplashScreen2ModelTxtSkip = splashScreen2VMSplashScreen2ModelGetValue.getTxtSkip();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKamiSangatSen, splashScreen2VMSplashScreen2ModelTxtKamiSangatSen);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelamatDatang, splashScreen2VMSplashScreen2ModelTxtSelamatDatang);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSkip, splashScreen2VMSplashScreen2ModelTxtSkip);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): splashScreen2VM.splashScreen2Model
        flag 1 (0x2L): splashScreen2VM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}