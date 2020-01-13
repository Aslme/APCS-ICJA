package com.JackandKelly.hangman;

public class WordList {

    // instance variables - replace the example below with your own
    private String[] words;

    public WordList() {
// initialise instance variables
        this.words = "abolish abridge abstract acclaim accommodate accord adamant advent adversary adversity aesthetic affiliation affirmation affliction aftermath aggravation ambidextrous ambiguous anecdote anguish animated annihilate anonymous apprehensive apprentice aptitude arbitrary arid artifact aspiration assent assertive audacious augment auxiliary avert belligerent benevolent benign bestow bewilder boisterous breach brevity calligraphy cavernous chaotic charisma choreography chronicle chronological circumstantial clientele coalition coerce collaborate collateral colossal commandeer commemorate communal competent concede concentric concise concurrent condemnation condole conglomerate conjecture conscientious consensus constrain contemplate contemporary contrary convene conventional convergent cordial cornucopia credible cynical decipher deficit denounce deprivation derivative designation desolate despicable deterrent deviate dilemma dire discern discrepancy disentangle dismantle dispel disposition dissension distortion divergent diversion dominion dormant dreary dubious eccentric eclipse ecstatic egotistical eloquent embark emphatic encompass eradicate erratic excise exclusion excruciating excursion exemplify expansive facilitate fanaticism fidelity flaunt fluctuate formative formulate fortification fossilized frivolous fruitless futile generic genre gingerly gratification gullible harmonious havoc hindrance homage homogeneous hypocritical hypothetical illustrious impediment impending impenetrable imperative implicit imposition impoverished improvise impulsive inanimate inaugural incarcerate incompatible inconceivable inconclusive inconsequential indispensable induce ineffectual inference infiltrate ingenuity ingrained inherent inhibit initiate innovation instigate integral interim intricate introvert irrelevant jargon jeopardy judicious kinetic laborious lattice lavish longevity luminous luxuriant malice malignant mediocre me lancholy memorandum metaphor metropolitan moderation monotonous monumental morale naive nocturnal norm notorious novice nurture objective obliterate ominous omnipotent omniscient parable paradox paramount paraphrase patronize perennial perilous periphery pervasive piety placid plight porous posterity potency preamble predecessor predicament predominant procrastinate procure prophetic protocol proximity purge quarantine ransack ratification rationale ravage ravenous rectify referendum refrain refurbish regime rehabilitate reimburse relinquish reminiscent remnant renovate repercussion replenish repulsive requisite resolve retaliate retort reversion rhetoric rubble rustic sabotage saga sanction satire seasoned secular sedentary senile serene sinister skeptic sovereign spatial squander stagnant stature statutory stereotype strife stupendous subdue subterranean subtle subversive succumb superficial superlative supplement surge susceptible synthesis temperance tenacious tentative terrestrial torrential tranquil traverse trifle trivial turmoil unanimous undermine unison unprecedented unquenchable unrestrained unsightly unsurpassed vengeful versatile viable vibrant vicious vile vintage vogue wary wholesome".split(" ");

    }

    public String getRandomWord() {
        int wordIndex = (int) (words.length * Math.random());
        return words[wordIndex];
    }

    public char[] wordToCharArraySetup(String word){
        return word.toCharArray();
    }

}
