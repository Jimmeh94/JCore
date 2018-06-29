package jimmy.jcore.services;


import jimmy.jcore.services.paricles.ParticleModifier;
import jimmy.jcore.utils.Key;

public class PlayerKeys {

    /**
     * Economy
     */
    public Key<Boolean> ECO_REQUESTS_AUTO_DENY = new Key<>(false);
    public Key<Boolean> ECO_OTHERS_SEE_BALANCE = new Key<>(true);

    //=======================================================================

    /**
     * MISC
     */
    public Key<ParticleModifier> MISC_PARTICLE_MODIFIER = new Key<>(ParticleModifier.NORMAL);
    public Key<Boolean> MISC_SHOW_POLLS_IN_CHAT = new Key<>(true);
    public Key<Boolean> MISC_FORMAT_TIME = new Key<>(true);

}
