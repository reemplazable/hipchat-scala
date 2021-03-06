package com.imadethatcow.hipchat.common.caseclass

case class HistoriesLinks(self: String, prev: String = "", next: String = "") extends Serializable
case class HistoriesResponse(items: Seq[HistoryItem], startIndex: Long, maxResults: Long, links: HistoriesLinks) extends Serializable
// TODO look into Jackson's @JsonIgnoreProperties annotation
// TODO kinda sucks that "from" seems to either return an object or a string :p
case class HistoryItem(color: String, date: String, file: HCFile, from: Any, id: String, mentions: Seq[MentionItem], message: String, message_format: String) extends Serializable
case class HistoryItemFromString(color: String, date: String, file: HCFile, from: String, id: String, mentions: Seq[MentionItem], message: String, message_format: String) extends Serializable
