package co.demo.lab3.program1;

public class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy,
                        String soundEffectsTechnology,
                        String visualEffectsTechnology) {
        super(movieName, producedBy);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public SpecialMovie(String movieName, String producedBy,
                        String directedBy, int duration, int year, String category,
                        String soundEffectsTechnology,
                        String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public void setSoundEffectsTechnology(String sfx) {
        this.soundEffectsTechnology = sfx;
    }
    public void setVisualEffectsTechnology(String vfx) {
        this.visualEffectsTechnology = vfx;
    }

    @Override
    public String showDetails() {
        return super.showDetails()
                + ", SFX: " + soundEffectsTechnology
                + ", VFX: " + visualEffectsTechnology;
    }
}

