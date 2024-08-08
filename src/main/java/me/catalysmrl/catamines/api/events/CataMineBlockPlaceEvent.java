package me.catalysmrl.catamines.api.events;

import me.catalysmrl.catamines.api.mine.CataMine;
import me.catalysmrl.catamines.mine.components.composition.CataMineBlock;
import me.catalysmrl.catamines.mine.components.composition.CataMineComposition;
import me.catalysmrl.catamines.mine.components.region.CataMineRegion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockPlaceEvent;
import org.jetbrains.annotations.NotNull;

public class CataMineBlockPlaceEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private boolean isCancelled;

    private final CataMine cataMine;
    private final CataMineRegion cataMineRegion;
    private final CataMineComposition cataMineComposition;
    private final CataMineBlock cataMineBlock;

    private final BlockPlaceEvent blockPlaceEvent;

    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public CataMineBlockPlaceEvent(CataMine cataMine, CataMineRegion cataMineRegion, CataMineComposition cataMineComposition, CataMineBlock cataMineBlock, BlockPlaceEvent blockPlaceEvent) {
        this.cataMine = cataMine;
        this.cataMineRegion = cataMineRegion;
        this.cataMineComposition = cataMineComposition;
        this.cataMineBlock = cataMineBlock;
        this.blockPlaceEvent = blockPlaceEvent;
    }

    public CataMine getCataMine() {
        return cataMine;
    }

    public CataMineRegion getCataMineRegion() {
        return cataMineRegion;
    }

    public CataMineComposition getCataMineComposition() {
        return cataMineComposition;
    }

    public CataMineBlock getCataMineBlock() {
        return cataMineBlock;
    }

    public BlockPlaceEvent getBlockPlaceEvent() {
        return blockPlaceEvent;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }
}
