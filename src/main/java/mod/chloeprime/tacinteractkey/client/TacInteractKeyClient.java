package mod.chloeprime.tacinteractkey.client;

import com.tac.guns.client.GunConflictContext;
import com.tac.guns.client.settings.TacKeyBingding;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

public class TacInteractKeyClient
{
//    public static final KeyBinding KEY_GUN_INTERACT = new KeyBinding(
//            "key.tacinteractkey.interact", GunConflictContext.IN_GAME_HOLDING_WEAPON,
//            InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_F, "key.categories.inventory"
//    );
    // Use TacKeyBingding to avoid duplicate key respond
    // In order to compat with fxxking TaC 0.3.8's mixin
    // In other words, it's more recommended to use codes
    // above when TaC is not in 0.3.8
    public static final TacKeyBingding KEY_GUN_INTERACT = new TacKeyBingding(
            "key.tacinteractkey.interact",  GLFW.GLFW_KEY_F, "key.categories.inventory", false
    );

    public static void construct()
    {
        InteractHintHud.init();
    }

    public static void clientSetup(FMLClientSetupEvent e)
    {
        ClientRegistry.registerKeyBinding(KEY_GUN_INTERACT);
    }
}
