package edu.robertconstantin.animeappcliient.feature_heroes.domain.repository

import edu.robertconstantin.animeappcliient.core.util.Resource
import edu.robertconstantin.animeappcliient.feature_heroes.domain.model.HeroDM

interface IHeroRepository {
    suspend fun getAllHeroes(): Resource<List<HeroDM>>
}