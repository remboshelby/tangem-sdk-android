package com.tangem.tasks;

import java.lang.System;

/**
 * Task that allows to read Tangem card and verify its private key.
 *
 * It performs two commands, [ReadCommand] and [CheckWalletCommand], subsequently.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J9\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002J9\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016JA\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/tangem/tasks/ScanTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/common/card/Card;", "Lcom/tangem/commands/WalletSelectable;", "walletIndex", "Lcom/tangem/commands/WalletIndex;", "(Lcom/tangem/commands/WalletIndex;)V", "requiresPin2", "", "getRequiresPin2", "()Z", "getWalletIndex", "()Lcom/tangem/commands/WalletIndex;", "setWalletIndex", "readSlixTag", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "run", "runCheckWalletIfNeeded", "card", "tangem-core"})
public final class ScanTask implements com.tangem.CardSessionRunnable<com.tangem.commands.common.card.Card>, com.tangem.commands.WalletSelectable {
    private final boolean requiresPin2 = false;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.commands.WalletIndex walletIndex;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.common.card.Card>, kotlin.Unit> callback) {
    }
    
    private final void runCheckWalletIfNeeded(com.tangem.commands.common.card.Card card, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.common.card.Card>, kotlin.Unit> callback) {
    }
    
    private final void readSlixTag(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.common.card.Card>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.commands.WalletIndex getWalletIndex() {
        return null;
    }
    
    @java.lang.Override()
    public void setWalletIndex(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.WalletIndex p0) {
    }
    
    public ScanTask(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.WalletIndex walletIndex) {
        super();
    }
    
    public ScanTask() {
        super();
    }
}