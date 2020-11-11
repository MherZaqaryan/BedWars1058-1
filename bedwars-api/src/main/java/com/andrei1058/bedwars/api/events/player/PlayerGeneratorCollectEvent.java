package com.andrei1058.bedwars.api.events.player;

import com.andrei1058.bedwars.api.arena.IArena;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PlayerGeneratorCollectEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;
    private Item item;
    private IArena arena;
    private boolean cancelled = false;

    /**
     * Triggered when players collect from generators
     */
    public PlayerGeneratorCollectEvent(Player player, Item item, IArena arena) {
        this.player = player;
        this.item = item;
        this.arena = arena;
    }

    public IArena getArena() {
        return arena;
    }

    /**
     * Get the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the item entity involved
     */
    public Item getItem() {
        return item;
    }

    /**
     * Get the itemStack involved
     */
    public ItemStack getItemStack() {
        return item.getItemStack();
    }

    /**
     * Cancel this event
     */
    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
