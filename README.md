# ColonyCrash
**Entry for the libGDX Jam**

Colony Crash is a card-driven game about building and surviving in a space colony. The player and the antagonist play a semi-semetrical game where both play cards to affect the Colony in various ways. Both sides will have a set of goals to acheive before the end of the game (typically ends after either X turns) that add points to their side. The player with the highest point count at the end wins.

*Players*
The Colony: The Colony player is the one who is attempting to build the colony. Their deck is composed of [Colonists], [Modules], [Actions] and [Events], each of which benefit the colony in some way. Their goal typically involves surviving X number of turns, producing a certain number of Food, Material or Power per turn, etc.

The Universe: The Universe player is the one playing the 'random' events that the universe throws at the colony. Their deck is composed of [Entities], [Actions] and [Events] which may benefit or injure the colony in some way. Their goals typically involve preventing the player from acheiving some goal, however some may be associated with helping a colony prosper.

*Colony*
The colony is made up of a series of Modules that are connected together. Each module provides some sort of service to the colony: Quarters (which increases the number of Colonists that can be played), Food (required to feed colonists and perform actions), Materials (required to build modules and perform actions), Power (required to power modules) and Storage (for both food and materials.) Each module may also provide some other service.

The Colony is also the home to the Colonists and the Entities. These are permanent effects that are put into play by the players which are used to get various benefits or perform various tasks.

Each Module and Colonist has their own 'priority' value which is used to determine how effects in the world are dealt with. The priority is used to determine which modules are damaged during certain events (low priority are typically damaged first) and which are repaired first (high priority first.) During a starving event the highest priority colonist will always leave.

*Cards*
Colonists: Colonists are people who live in the colony. To deploy one certain conditions must be met (Remaining quarters, a specific module, etc.) They eat food (1/2 Food per turn) and provide various abilities or bonuses just for being the colony. Each time the colony starves the colonist with the highest priority leaves.

Modules: Modules are parts of the colony. To deploy one certain conditions must be met (Minimum power required, materials.) They provide various things are the start of the turn, as mentioned in the 'Colony' section.

Events: Events are things that just happen requiring a situation (some number of Colonists, some type of Colonist, a specific Module, etc.)

Actions: Actions are things done by colonists requiring an expenditure of resources.

Entities: Entities are like Colonists, however they're typically a detriment to the colony or at least outside of the Colony player's control.
