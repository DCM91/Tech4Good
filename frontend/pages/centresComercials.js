import { Barris } from '@/components/Barris'
import { Layout } from '@/components/Layout'
import React from 'react'

export default function centresComercials() {
  return (
    <Layout title="Tech4good - Centres Comercials">
        <div className='text-2xl'>Centres Comercials</div>
        <div className='flex w-100 py-5 px-10'>
          <Barris />
        </div>
        
    </Layout>
    
  )
}
