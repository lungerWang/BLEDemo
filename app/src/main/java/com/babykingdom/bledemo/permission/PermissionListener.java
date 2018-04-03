package com.babykingdom.bledemo.permission;

import java.util.List;

/**
 * Created by Lunger on 2017/2/9.
 */

public interface PermissionListener {
    void onSucceed(int requestCode, List<String> grantPermissions);

    void onFailed(int requestCode, List<String> deniedPermissions);

}
