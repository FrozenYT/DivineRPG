package divinerpg.api.armor;

import net.minecraftforge.eventbus.api.Event;

public interface IPoweredArmorSet {

    /**
     * Gets current set describer
     */
    IArmorSet getArmorSetDescriber();

    /**
     * Gets equipped callback. Can be null
     */
    IEquipped getEquippedHandler();

    /**
     * Register current power ability
     *
     * @param clazz   - class of event
     * @param ability - ability handler
     */
    <T extends Event> IPoweredArmorSet addAbility(Class<T> clazz, IPowerAbility<T> ability);

    /**
     * Called on event when player is full equipped.
     *
     * @param event - Forge event
     */
    <T extends Event> void handleAbility(T event);
}
