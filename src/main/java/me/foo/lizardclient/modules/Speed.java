/*    */ package me.foo.lizardclient.modules;
/*    */ 
/*    */ import me.foo.lizardclient.module.Category;
/*    */ import me.foo.lizardclient.module.Module;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Speed
/*    */   extends Module
/*    */ {
/* 11 */   public static float speedMultiplyer = 1.4F;
/*    */   
/*    */   public Speed() {
/* 14 */     super("Speed", Category.MOVEMENT, 49);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onPlayerUpdate() {
/*    */     
/* 22 */     if ((this.mc.player.movementInput.forwardKeyDown || this.mc.player.movementInput.backKeyDown) && 
/* 23 */       !this.mc.player.isSneaking() && this.mc.player.onGround) {
/* 24 */       this.mc.player.motionX *= speedMultiplyer;
/* 25 */       this.mc.player.motionZ *= speedMultiplyer;
/*    */     } 

/*    */   }
/*    */ }