package nttrung.gapptech.net.mylovelyplace.util;

import android.content.Context;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import nttrung.gapptech.net.mylovelyplace.R;

/**
 * Created by TrungNguyen on 7/26/2017.
 */

public final class PermissionUtil {
    public static final void checkPermission(Context context, PermissionListener permissionListener, String[] permissions, String msg) {
        new TedPermission(context)
                .setPermissionListener(permissionListener)
                .setRationaleMessage(msg)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setGotoSettingButtonText(context.getString(R.string.setting))
                .setPermissions(permissions)
                .check();
    }
}
