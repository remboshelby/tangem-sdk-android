package com.tangem.tasks;

import java.lang.System;

/**
 * Task that allows to create wallet at Tangem card and verify its private key.
 * It performs `CreateWallet` and `CheckWalletCommand`,  subsequently.
 *
 * Initializer contain wallet configuration settings and wallet index pointer at which  index wallet should be created.
 * If index not provided task
 * attempt to create wallet at any empty index, until success or reach max index
 *
 * Note: `WalletConfig` and `WalletIndexValue` available for cards with COS v.4.0 and higher.
 * @property config: if not set task will create wallet with settings that was specified in card data
 * while personalization
 * @property walletIndexValue: If not provided task will attempt to create wallet on default index.
 * If failed - task will keep trying to create.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJX\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\'\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020!\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00170 H\u0002\u00a2\u0006\u0002\u0010%J9\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\'\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020!\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00170 H\u0016J#\u0010\'\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010)R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006*"}, d2 = {"Lcom/tangem/tasks/CreateWalletTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/CreateWalletResponse;", "Lcom/tangem/commands/WalletSelectable;", "config", "Lcom/tangem/commands/WalletConfig;", "walletIndexValue", "", "(Lcom/tangem/commands/WalletConfig;Ljava/lang/Integer;)V", "firstAttemptWalletIndex", "Ljava/lang/Integer;", "requiresPin2", "", "getRequiresPin2", "()Z", "shouldCreateAtAnyIndex", "walletIndex", "Lcom/tangem/commands/WalletIndex;", "getWalletIndex", "()Lcom/tangem/commands/WalletIndex;", "setWalletIndex", "(Lcom/tangem/commands/WalletIndex;)V", "createWallet", "", "session", "Lcom/tangem/CardSession;", "card", "Lcom/tangem/commands/common/card/Card;", "index", "curve", "Lcom/tangem/commands/common/card/EllipticCurve;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "(Lcom/tangem/CardSession;Lcom/tangem/commands/common/card/Card;Ljava/lang/Integer;Lcom/tangem/commands/common/card/EllipticCurve;Lkotlin/jvm/functions/Function1;)V", "run", "updateWalletIndexToNext", "walletsCount", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "tangem-core"})
public final class CreateWalletTask implements com.tangem.CardSessionRunnable<com.tangem.commands.CreateWalletResponse>, com.tangem.commands.WalletSelectable {
    private final boolean requiresPin2 = false;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.commands.WalletIndex walletIndex;
    private java.lang.Integer firstAttemptWalletIndex;
    private boolean shouldCreateAtAnyIndex = false;
    private final com.tangem.commands.WalletConfig config = null;
    private java.lang.Integer walletIndexValue;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
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
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.CreateWalletResponse>, kotlin.Unit> callback) {
    }
    
    private final void createWallet(com.tangem.CardSession session, com.tangem.commands.common.card.Card card, java.lang.Integer index, com.tangem.commands.common.card.EllipticCurve curve, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.CreateWalletResponse>, kotlin.Unit> callback) {
    }
    
    private final java.lang.Integer updateWalletIndexToNext(java.lang.Integer index, java.lang.Integer walletsCount) {
        return null;
    }
    
    public CreateWalletTask(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.WalletConfig config, @org.jetbrains.annotations.Nullable()
    java.lang.Integer walletIndexValue) {
        super();
    }
    
    public CreateWalletTask() {
        super();
    }
}