package riking.horses;

import net.minecraft.server.v1_6_R2.AttributeInstance;
import net.minecraft.server.v1_6_R2.GenericAttributes;
import net.minecraft.server.v1_6_R2.EntityHorse;

import org.bukkit.craftbukkit.v1_6_R2.entity.CraftHorse;
import org.bukkit.entity.Horse;

public class Unsafe {
    /**
     * Get the intrinsic speed value of the horse.
     *
     * @param horse bukkit horse
     * @throws NoClassDefFoundError on mismatched version
     * @return 0 for error, positive value for raw speed
     */
    public static double getHorseSpeed(Horse horse) {
        EntityHorse ehorse = ((CraftHorse) horse).getHandle();
        AttributeInstance inst = ehorse.getAttributeInstance(GenericAttributes.d); // GenericAttributes.SPEED
        if (inst == null) {
            return 0;
        }
        return inst.b(); // AttributeInstance.getBaseValue() / getUnmodifiedValue()
    }
}
