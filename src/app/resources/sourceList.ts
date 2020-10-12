import { link } from "fs"
import { sourcesList } from "./types"

export const sources: sourcesList = [
	{ name: "BoxNovel", link: "https://boxnovel.com", icon: "assets/img/sources/boxnovel-logo.png" },
	{ name: "ReadLightNovel", link: "https://www.readlightnovel.org", icon: "assets/img/sources/readlightnovel-logo.png" },
]

export const deprecatedSources: sourcesList = [
	{ name: "NovelPlanet", link: "https://novelplanet.com", icon: "assets/img/sources/novelplanet-logo.png" }
]
