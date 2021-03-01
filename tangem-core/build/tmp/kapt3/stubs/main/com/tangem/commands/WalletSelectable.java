package com.tangem.commands;

import java.lang.System;

/**
 * Use this to identify that CardSessionRunnable type can point to specific wallet to interact with
 * Note: Available for cards with COS v.4.0 and higher
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tangem/commands/WalletSelectable;", "", "walletIndex", "Lcom/tangem/commands/WalletIndex;", "getWalletIndex", "()Lcom/tangem/commands/WalletIndex;", "setWalletIndex", "(Lcom/tangem/commands/WalletIndex;)V", "tangem-core"})
public abstract interface WalletSelectable {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.tangem.commands.WalletIndex getWalletIndex();
    
    public abstract void setWalletIndex(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.WalletIndex p0);
}