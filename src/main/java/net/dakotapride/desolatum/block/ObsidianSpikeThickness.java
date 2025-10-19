package net.dakotapride.desolatum.block;

import net.minecraft.util.StringRepresentable;

public enum ObsidianSpikeThickness implements StringRepresentable {
    TIP("tip"),
    BASE("base");

    private final String name;

    ObsidianSpikeThickness(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
