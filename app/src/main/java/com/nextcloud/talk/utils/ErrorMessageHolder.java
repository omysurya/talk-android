/*
 * Nextcloud Talk application
 *
 * @author Mario Danic
 * Copyright (C) 2017 Mario Danic <mario@lovelyhq.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextcloud.talk.utils;

import android.support.annotation.Nullable;

public class ErrorMessageHolder {
    private static final ErrorMessageHolder holder = new ErrorMessageHolder();
    private ErrorMessageType errorMessageType;

    public static ErrorMessageHolder getInstance() {
        return holder;
    }

    public ErrorMessageType getMessageType() {
        return errorMessageType;
    }

    public void setMessageType(@Nullable ErrorMessageType errorMessageType) {
        this.errorMessageType = errorMessageType;
    }

    public enum ErrorMessageType {
        WRONG_ACCOUNT, ACCOUNT_UPDATED_NOT_ADDED, ACCOUNT_SCHEDULED_FOR_DELETION, SERVER_WITHOUT_TALK,
        FAILED_TO_IMPORT_ACCOUNT, ACCOUNT_WAS_IMPORTED, CALL_PASSWORD_WRONG
    }


}
