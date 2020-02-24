package divinerpg.api.armor;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Decorator for subscription
 */
public class ForgeEventHandler<T extends Event> {

    private Class clazz;
    private java.util.function.Consumer<T> action;
    private java.util.function.Predicate<T> canExecute;

    public ForgeEventHandler(Class clazz, Consumer<T> action) {
        Objects.requireNonNull(clazz);
        Objects.requireNonNull(action);

        this.clazz = clazz;
        this.action = action;
    }

    /**
     * Clonning ctor
     */
    private ForgeEventHandler(ForgeEventHandler x, Predicate<T> canExecute) {
        this(x.clazz, x.action);

        this.canExecute = canExecute;
    }

    public ForgeEventHandler cloneWithPredicate(Predicate<T> canExecute) {
        return new ForgeEventHandler<>(this, canExecute);
    }

    @SubscribeEvent
    public void handle(T event) {
        if (event == null || !clazz.equals(event.getClass()))
            return;

        if (canExecute == null || !canExecute.test(event))
            return;

        action.accept(event);
    }

    public void subscribe() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void unsubscribe() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }
}
