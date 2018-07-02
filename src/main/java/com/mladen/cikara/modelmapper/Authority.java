package com.mladen.cikara.modelmapper;

/**
 * This is single place where security authorities are added. You can add new
 * Authorities but if you remove or rename existing authorty you must create
 * database migration with same effect.
 *
 * @author mladen
 *
 */
public enum Authority {
  ROLE_ADMIN, ROLE_SYS_ADMIN, ROLE_USER;
}
