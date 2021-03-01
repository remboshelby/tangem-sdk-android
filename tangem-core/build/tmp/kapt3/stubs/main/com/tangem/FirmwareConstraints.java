package com.tangem;

import java.lang.System;

/**
 * Created by Anton Zhilenkov on 23/11/2020.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/FirmwareConstraints;", "", "()V", "AvailabilityVersions", "DeprecationVersions", "tangem-core"})
public final class FirmwareConstraints {
    
    public FirmwareConstraints() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/tangem/FirmwareConstraints$AvailabilityVersions;", "", "()V", "files", "Lcom/tangem/commands/common/card/FirmwareVersion;", "getFiles", "()Lcom/tangem/commands/common/card/FirmwareVersion;", "pin2IsDefault", "getPin2IsDefault", "walletData", "getWalletData", "tangem-core"})
    public static final class AvailabilityVersions {
        @org.jetbrains.annotations.NotNull()
        private static final com.tangem.commands.common.card.FirmwareVersion walletData = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.tangem.commands.common.card.FirmwareVersion pin2IsDefault = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.tangem.commands.common.card.FirmwareVersion files = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.tangem.FirmwareConstraints.AvailabilityVersions INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getWalletData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getPin2IsDefault() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getFiles() {
            return null;
        }
        
        private AvailabilityVersions() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/FirmwareConstraints$DeprecationVersions;", "", "()V", "walletRemainingSignatures", "Lcom/tangem/commands/common/card/FirmwareVersion;", "getWalletRemainingSignatures", "()Lcom/tangem/commands/common/card/FirmwareVersion;", "tangem-core"})
    public static final class DeprecationVersions {
        @org.jetbrains.annotations.NotNull()
        private static final com.tangem.commands.common.card.FirmwareVersion walletRemainingSignatures = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.tangem.FirmwareConstraints.DeprecationVersions INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getWalletRemainingSignatures() {
            return null;
        }
        
        private DeprecationVersions() {
            super();
        }
    }
}