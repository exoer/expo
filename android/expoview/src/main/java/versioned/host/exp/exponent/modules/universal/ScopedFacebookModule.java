package versioned.host.exp.exponent.modules.universal;

import android.content.Context;

import com.facebook.FacebookSdk;

import org.unimodules.core.interfaces.LifecycleEventListener;

import expo.modules.facebook.FacebookModule;

public class ScopedFacebookModule extends FacebookModule implements LifecycleEventListener {
  public ScopedFacebookModule(Context context) {
    super(context);
  }

  @Override
  public void onHostResume() {
    if (mAppId != null) {
      FacebookSdk.setApplicationId(mAppId);
    }
  }

  @Override
  public void onHostPause() {
    FacebookSdk.setApplicationId(null);
  }

  @Override
  public void onHostDestroy() {
    // do nothing
  }
}
