package net.vulkanmod.render.chunk.build.light;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.vulkanmod.render.model.quad.QuadView;
import net.vulkanmod.render.chunk.build.light.data.QuadLightData;

/**
 * Light pipelines allow model quads for any location in the world to be lit using various backends, including fluids
 * and block entities. 
 */
public interface LightPipeline {
    /**
     * Calculates the light data for a given block model quad, storing the result in {@param out}.
     * @param quad The block model quad
     * @param pos The block position of the model this quad belongs to
     * @param out The data arrays which will store the calculated light data results
     * @param cullFace The cull face of the quad
     * @param lightFace The light face of the quad
     * @param shade True if the block is shaded by ambient occlusion
     */
    void calculate(QuadView quad, BlockPos pos, QuadLightData out, Direction cullFace, Direction lightFace, boolean shade);
}
