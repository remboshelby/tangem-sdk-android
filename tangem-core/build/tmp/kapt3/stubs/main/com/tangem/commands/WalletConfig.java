package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/tangem/commands/WalletConfig;", "", "isReusable", "", "prohibitPurgeWallet", "curveId", "Lcom/tangem/commands/common/card/EllipticCurve;", "signingMethods", "Lcom/tangem/commands/common/card/masks/SigningMethod;", "walletData", "Lcom/tangem/commands/WalletData;", "(ZZLcom/tangem/commands/common/card/EllipticCurve;Lcom/tangem/commands/common/card/masks/SigningMethod;Lcom/tangem/commands/WalletData;)V", "getCurveId", "()Lcom/tangem/commands/common/card/EllipticCurve;", "()Z", "getProhibitPurgeWallet", "getSigningMethods", "()Lcom/tangem/commands/common/card/masks/SigningMethod;", "getWalletData", "()Lcom/tangem/commands/WalletData;", "getSettingsMask", "Lcom/tangem/commands/common/card/masks/WalletSettingsMask;", "tangem-core"})
public final class WalletConfig {
    private final boolean isReusable = false;
    private final boolean prohibitPurgeWallet = false;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.common.card.EllipticCurve curveId = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.common.card.masks.SigningMethod signingMethods = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.WalletData walletData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.common.card.masks.WalletSettingsMask getSettingsMask() {
        return null;
    }
    
    public final boolean isReusable() {
        return false;
    }
    
    public final boolean getProhibitPurgeWallet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.common.card.EllipticCurve getCurveId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.common.card.masks.SigningMethod getSigningMethods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.WalletData getWalletData() {
        return null;
    }
    
    public WalletConfig(boolean isReusable, boolean prohibitPurgeWallet, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.card.EllipticCurve curveId, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.card.masks.SigningMethod signingMethods, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.WalletData walletData) {
        super();
    }
}